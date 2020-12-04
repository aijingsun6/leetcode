package org.alking.p600;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P659 {

    public static class Range {
        public int start;
        public int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public boolean isPossible(int[] nums) {

        PriorityQueue<Range> queue = new PriorityQueue<>(new Comparator<Range>() {
            @Override
            public int compare(Range o1, Range o2) {
                int v = o2.end - o1.end;
                if(v != 0){
                    return v;
                }
                return o2.start - o1.start;
            }
        });

        for (int idx = 0; idx < nums.length; idx++) {
            int v = nums[idx];
            int size = queue.size();
            if (size == 0) {
                queue.add(new Range(v, v));
                continue;
            }
            ArrayList<Range> list = new ArrayList<>();
            boolean find = false;
            while (!queue.isEmpty()) {
                Range range = queue.poll();
                list.add(range);
                if (range.end == v) {
                } else if (range.end + 1 == v) {
                    range.end = v;
                    find = true;
                    break;
                } else if (range.end + 1 < v) {
                    break;
                }
            }
            queue.addAll(list);
            if (!find) {
                queue.add(new Range(v, v));
            }
        }

        for (Range r : queue) {
            if (r.end - r.start < 2) {
                return false;
            }
        }
        return true;

    }

}
