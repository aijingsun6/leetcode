package org.alking.p0;

public class P26 {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int idx = 1;
        int last = nums[0];
        for(int i = 1; i < nums.length;i++){
            int v = nums[i];
            if(v != last){
                nums[idx++] = v;
                last= v;
            }

        }
        return idx;
    }
}
