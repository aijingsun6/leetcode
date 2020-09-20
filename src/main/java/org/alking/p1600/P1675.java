package org.alking.p1600;

public class P1675 {

    public int search(int[] nums, int target) {

        int res = 0;
        for(int v: nums){
            if(v == target){
                res += 1;
            }
        }
        return res;

    }
}
