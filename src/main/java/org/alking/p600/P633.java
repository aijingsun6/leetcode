package org.alking.p600;

public class P633 {

    public boolean judgeSquareSum(int c) {

        int min = 0;
        int max = (int)Math.sqrt(c);

        int left = min;
        int right = max;
        int left2 = left * left;
        int right2 = right * right;

        while (left <= right){

            int v = left2 + right2;
            if(v < c){
                left += 1;
                left2 = left * left;
            }else if(v > c){
                right -= 1;
                right2 = right * right;
            }else{
                return true;
            }

        }

        return false;

    }


}
