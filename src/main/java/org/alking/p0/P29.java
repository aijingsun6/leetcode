package org.alking.p0;


/**
 * https://leetcode-cn.com/problems/divide-two-integers/
 */
public class P29 {

    public int divide(int dividend, int divisor) {
        boolean neg = false;
        if (dividend > 0 && divisor < 0) {
            neg = true;
        } else if (dividend < 0 && divisor > 0) {
            neg = true;
        }
        long r = divide2(Math.abs((long)dividend), Math.abs((long)divisor));
        if (r >= Integer.MAX_VALUE && !neg){
            return Integer.MAX_VALUE;
        }
        if(r >= Integer.MAX_VALUE && neg){
            return Integer.MIN_VALUE;
        }
        return  neg ? -(int)r : (int)r;

    }

    private long divide2(long dividend, long divisor) {

        int shift = 0;

        long result = 0;

        while (dividend >= (divisor << (shift + 1))) {
            shift++;
        }
        // divisor<<shift < dividend < divisor<<(shift+1)

        while (dividend >0 && shift >= 0) {
            long v = divisor << shift;
            if (dividend >= v) {
                result += (1 << shift);
                dividend -= v;
            }
            shift--;
        }
        return Math.abs(result);
    }


}
