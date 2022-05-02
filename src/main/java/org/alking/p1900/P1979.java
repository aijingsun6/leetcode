package org.alking.p1900;

public class P1979 {

    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int v: nums){
            max = Math.max(max,v);
            min = Math.min(min,v);
        }
        if(max == min){
            return min;
        }
        while (min > 0){
            if(max % min == 0){
                return min;
            }
            int t = max % min;
            max = min;
            min = t;
        }
        return 1;
    }

}
