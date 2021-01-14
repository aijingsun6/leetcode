package org.alking.p500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P599 {

    public static class SPos {
        public String value;
        public int idx;

        public SPos(String value, int idx) {
            this.value = value;
            this.idx = idx;
        }
    }


    public String[] findRestaurant(String[] list1, String[] list2) {

        if (list1 == null || list1.length == 0) {
            return new String[0];
        }

        if (list2 == null || list2.length == 0) {
            return new String[0];
        }

        SPos[] sp1 = new SPos[list1.length];
        for (int i = 0; i < list1.length; i++) {
            sp1[i] = new SPos(list1[i], i);
        }

        SPos[] sp2 = new SPos[list2.length];
        for (int i = 0; i < list2.length; i++) {
            sp2[i] = new SPos(list2[i], i);
        }

        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        Comparator<SPos> comparator = new Comparator<SPos>() {
            @Override
            public int compare(SPos o1, SPos o2) {
                return o1.value.compareTo(o2.value);
            }
        };
        Arrays.sort(sp1, comparator);
        Arrays.sort(sp2, comparator);

        PriorityQueue<SPos> queue = new PriorityQueue<>(new Comparator<SPos>() {
            @Override
            public int compare(SPos o1, SPos o2) {
                return o1.idx - o2.idx;
            }
        });

        while (idx1 < list1.length && idx2 < list2.length) {
            SPos s1 = sp1[idx1];
            SPos s2 = sp2[idx2];
            int comp = s1.value.compareTo(s2.value);
            if (comp == 0) {
                queue.add(new SPos(s1.value, s1.idx + s2.idx));
                idx1 += 1;
                idx2 += 1;
            } else if (comp < 0) {
                idx1 += 1;
            } else {
                idx2 += 1;
            }
        }
        ArrayList<String> res = new ArrayList<>();
        int min = queue.peek().idx;
        while (!queue.isEmpty() && queue.peek().idx == min) {
            res.add(queue.poll().value);
        }
        return res.toArray(new String[res.size()]);
    }
}
