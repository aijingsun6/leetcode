package org.alking.p500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class P599 {


    public String[] findRestaurant(String[] list1, String[] list2) {

        if (list1 == null || list1.length == 0) {
            return new String[0];
        }

        if (list2 == null || list2.length == 0) {
            return new String[0];
        }
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }

        String[] res = new String[list1.length];
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        Arrays.sort(list1);
        Arrays.sort(list2);
        while (idx1 < list1.length && idx2 < list2.length) {

            String s1 = list1[idx1];
            String s2 = list2[idx2];
            int comp = s1.compareTo(s2);
            if (comp == 0) {
                res[idx++] = s1;
                idx1 += 1;
                idx2 += 1;
            } else if (comp < 0) {
                idx1 += 1;
            } else {
                idx2 += 1;
            }

        }
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();

        for (int i = 0; i < idx; i++) {
            String s = res[i];
            int score = map1.get(s) + map2.get(s);
            ArrayList<String> list = treeMap.getOrDefault(score, new ArrayList<>());
            list.add(s);
            treeMap.put(score, list);
        }
        ArrayList<String> min = treeMap.firstEntry().getValue();
        res = new String[min.size()];
        for (int i = 0; i < min.size(); i++) {
            res[i] = min.get(i);
        }
        return res;
    }
}
