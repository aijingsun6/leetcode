package org.alking.p500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            idxMap.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<Integer> idxList = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            String s = list2[j];
            if (!idxMap.containsKey(s)) {
                continue;
            }
            int v = idxMap.get(s) + j;
            if (v < min) {
                min = v;
                idxList = new ArrayList<>();
                idxList.add(j);
            } else if (v == min) {
                idxList.add(j);
            }

        }
        String[] result = new String[idxList.size()];
        for (int i = 0; i < idxList.size(); i++) {
            result[i] = list2[idxList.get(i)];
        }
        return result;
    }
}
