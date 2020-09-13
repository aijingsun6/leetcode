package org.alking.p1200;

public class P1295 {

    public int findNumbers(int[] nums) {

        int sum = 0;
        String s;
        for(int v: nums){
            s = String.valueOf(v);
            if(s.length() % 2 == 0){
                sum += 1;
            }


        }
        return sum;
    }
}
