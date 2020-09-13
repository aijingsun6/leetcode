package org.alking.p600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P697 {

    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        HashMap<Integer, List<Integer>> countMap = new HashMap<>();

        int max = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            int v = nums[idx];
            List<Integer> list = countMap.getOrDefault(v, new ArrayList<>());
            list.add(idx);
            countMap.put(v, list);
            int size = list.size();
            if(size >= max){
                max = size;
            }

        }

        int result = Integer.MAX_VALUE;
        for(Map.Entry<Integer,List<Integer>> entry: countMap.entrySet()){

            List<Integer> list = entry.getValue();
            int size = list.size();
            if(size == max){
                result = Math.min(result, list.get(size - 1) - list.get(0) + 1);
            }
        }

        return result;

    }
}
