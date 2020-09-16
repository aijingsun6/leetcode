package org.alking.p300;

public class P342 {


    public boolean isPowerOfFour(int num) {

        if(num < 1){
            return false;
        }

        if(num == 1){
            return true;
        }
        int m = num -1;
        String s = Integer.toBinaryString(m);
        return !s.contains("0") && s.length() % 2 == 0;
    }
}
