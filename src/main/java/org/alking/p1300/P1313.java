package org.alking.p1300;

import java.util.ArrayList;

public class P1313 {

    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> acc = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx += 2) {


            int freq = nums[idx];
            int value = nums[idx+1];
            for(int i = 0; i <freq;i++){
                acc.add(value);
            }
        }
        int[] result = new int[acc.size()];
        for(int i = 0;i < result.length;i++){
            result[i]=acc.get(i);
        }
        return result;
    }
}
