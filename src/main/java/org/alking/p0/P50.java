package org.alking.p0;

import java.util.HashMap;

public class P50 {

    public double myPow(double x, int n) {
        this.memo.clear();
        this.memo.put(0, 1.0d);
        if(n > 0){
            return pow(x,n);
        }
        return  1.0d / pow(x,-n);
    }

    private HashMap<Integer, Double> memo = new HashMap<>();

    private double pow(double x, int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        double v = pow(x, n / 2);
        v = v * v;
        double result = n % 2 == 0 ? v : v * x;
        memo.put(n, result);
        return result;
    }


}
