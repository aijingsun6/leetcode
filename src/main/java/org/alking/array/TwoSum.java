package org.alking.array;

import java.util.*;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            List<Integer> v = map.getOrDefault(nums[i], new ArrayList<>());
            v.add(i);
            map.put(nums[i],v);
        }
        int[] acc = new int[2];
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            int x = entry.getKey();
            int y = target -x;
            if(map.containsKey(y)){
                List<Integer> list = map.get(y);
                if(x == y && list.size() > 1){
                    acc[0] = list.get(0);
                    acc[1] = list.get(1);
                    return acc;
                }

                if(x != y){
                    acc[0] = entry.getValue().get(0);
                    acc[1] = list.get(0);
                    return acc;
                }


            }


        }
        return null;

    }

}
