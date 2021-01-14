package org.alking.p1300;

import java.util.Arrays;

public class P1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        int size = nums.length;
        int[] sort = new int[size];
        System.arraycopy(nums, 0, sort, 0, nums.length);
        Arrays.sort(sort);
        int max = sort[size - 1];
        int[] map = new int[max + 1];
        for (int i = 1; i < sort.length; i++) {
            if (sort[i - 1] < sort[i]) {
                map[sort[i]] = i;
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = map[nums[i]];
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
