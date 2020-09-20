package org.alking.p1700;

public class P1740 {

    public int findMagicIndex(int[] nums) {

        if(nums == null || nums.length == 0){
            return -1;
        }

        for(int idx = 0; idx < nums.length;idx++){
            if(nums[idx] == idx){
                return idx;
            }
        }
        return -1;
    }
}
