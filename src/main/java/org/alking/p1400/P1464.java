package org.alking.p1400;

public class P1464 {


    public int maxProduct(int[] nums) {

        int[] maxArr = new int[2];
        // 0, 1
        for(int v: nums){

            if(v > maxArr[0]){
                maxArr[1] = maxArr[0];
                maxArr[0] = v;
            }else if(v > maxArr[1]){
                maxArr[1] = v;
            }

        }

        return (maxArr[0]-1) * (maxArr[1]-1);


    }
}
