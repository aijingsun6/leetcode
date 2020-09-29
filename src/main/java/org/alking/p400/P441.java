package org.alking.p400;

public class P441 {

    public int arrangeCoins(int n) {

        if(n == 0){
            return 0;
        }
        if(n < 2){
            return 1;
        }
        if(n < 6){
            return 2;
        }
        if(n < 10){
            return 3;
        }

        int sqrt = (int) Math.sqrt((long)n * 2);

        int start = sqrt - 3;

        for (int i = start; ; i++) {

            if ((i + 1) * (i + 2) > n * 2) {
                return i;
            }

        }

    }
}
