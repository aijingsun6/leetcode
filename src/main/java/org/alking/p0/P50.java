package org.alking.p0;

public class P50 {

    public double myPow(double x, int n) {
        if (x == 0) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        boolean neg = false;
        long m = n;
        if (m < 0) {
            neg = true;
            m = -m;
        }
        double result = pow(x, m);
        if (neg) {
            return 1 / result;
        }
        return result;
    }

    private double pow(double x, long n) {

        double result = 1.0d;
        double acc = x;
        while (n > 0) {

            if ((n & 1) > 0) {
                result = result * acc;
            }
            n = n >> 1;
            acc = acc * acc;
        }
        return result;
    }


}
