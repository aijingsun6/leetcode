package org.alking.p500;

public class P506 {

    public String[] findRelativeRanks(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new String[0];
        }


        // bucket
        int min = nums[0];
        int max = nums[0];
        for (int v : nums) {
            min = Math.min(min, v);
            max = Math.max(max, v);
        }
        int size = max - min + 1;
        int[] bucket = new int[size];
        for (int v : nums) {
            bucket[v - min] += 1;
        }
        int[] cache = new int[size];
        int sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (bucket[i] > 0) {
                cache[i] = sum + 1;
                sum += bucket[i];
            }
        }
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = cache[nums[i]-min];
            if(idx == 1){
                res[i] = "Gold Medal";
            }else if(idx == 2){
                res[i] = "Silver Medal";
            }else if(idx == 3){
                res[i] = "Bronze Medal";
            }else {
                res[i] = String.valueOf(idx);
            }
        }
        return res;
    }
}
