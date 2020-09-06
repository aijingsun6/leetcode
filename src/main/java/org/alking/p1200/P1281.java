package org.alking.p1200;

public class P1281 {

    public int subtractProductAndSum(int n) {

        int p = 1;
        int sum = 0;
        int v ;
        while ( n > 0){
            v = n % 10;
            p = p * v;
            sum = sum + v;
            n = n / 10;
        }
        return p - sum;
    }
}
