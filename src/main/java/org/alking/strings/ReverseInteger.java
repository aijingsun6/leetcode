package org.alking.strings;

public class ReverseInteger {

    public int reverse(int x) {

        boolean sign = x < 0;

        try {
            Integer v = Integer.valueOf(new StringBuffer(String.valueOf(Math.abs(x))).reverse().toString());
            if (sign) {
                return -v;
            }
            return v;
        } catch (Exception e) {

        }
        return 0;
    }
}
