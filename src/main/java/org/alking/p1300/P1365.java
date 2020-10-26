package org.alking.p1300;

import java.util.*;

public class P1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        if (nums == null || nums.length < 2) {
            return nums;
        }

        int[] sort = new int[nums.length];
        System.arraycopy(nums, 0, sort, 0, nums.length);
        Arrays.sort(sort);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < sort.length; i++) {
            if (sort[i - 1] < sort[i]) {
                map.put(sort[i], i);
            }
        }
        int[] res = new int[nums.length];
        for(int i=0;i < nums.length;i++){
            int v = nums[i];
            res[i] = map.getOrDefault(v,0);
        }
        return res;
    }

//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        TreeMap<Integer, List<Integer>> sortMap = new TreeMap<>();
//        int v;
//        List<Integer> list;
//        for (int i = 0; i < nums.length; i++) {
//            v = nums[i];
//            list = sortMap.getOrDefault(v, new ArrayList<>());
//            list.add(i);
//            sortMap.put(v, list);
//        }
//        int[] result = new int[nums.length];
//        int acc = 0;
//        for (Map.Entry<Integer, List<Integer>> entry : sortMap.entrySet()) {
//            list = entry.getValue();
//            for (int idx : list) {
//                result[idx] = acc;
//            }
//            acc += list.size();
//        }
//        return result;
//    }
}
