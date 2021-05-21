package org.alking.p500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P599 {


    public String[] findRestaurant(String[] list1, String[] list2) {

        if (list1 == null || list1.length == 0) {
            return new String[0];
        }

        if (list2 == null || list2.length == 0) {
            return new String[0];
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }


        List<String> acc = new ArrayList<>();
        int minScore = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String v = list2[i];
            if (map.containsKey(v)) {
                int score = map.get(v) + i;
                if (score < minScore) {
                    acc.clear();
                    acc.add(v);
                    minScore = score;
                } else if (score == minScore) {
                    acc.add(v);
                }
            }
        }

        return acc.toArray(new String[0]);
    }
}
