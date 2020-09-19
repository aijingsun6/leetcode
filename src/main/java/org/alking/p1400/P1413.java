package org.alking.p1400;

public class P1413 {

    public int minStartValue(int[] nums) {

        int sum = 0;
        int sumMin = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            sumMin = Math.min(sumMin,sum);
        }
        if(sumMin > 0){
            return 1;
        }
        return 1 - sumMin;

    }
}
