package org.alking.p2000;

public class P2057 {

    public int smallestEqual(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
