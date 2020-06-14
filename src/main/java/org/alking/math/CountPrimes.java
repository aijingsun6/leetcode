package org.alking.math;

public class CountPrimes {

    private boolean isPrime(int n) {
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int n) {

        if(n < 3){
            // n = 0 , 1 , 2
            return 0;
        }
        if(n < 4){
            // n = 3
            return 1;
        }
        if( n < 5){
            // n = 4;
            // 2, 3
            return 2;
        }
        int sum = 2;
        for(int i = 5; i < n; i ++){
            if(isPrime(i)){
                sum ++;
            }
        }
        return sum;

    }
}
