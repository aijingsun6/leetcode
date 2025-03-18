package org.alking.leetcode.p2600;

public class P2614 {

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        final int ROW = nums.length;

        int res = 0;
        for (int i = 0; i < ROW; i++) {
            int v = nums[i][i];
            if (v > res &&  isPrime(v)) {
                res = v;
            }
            v = nums[i][ROW - 1 - i];
            if (v > res && isPrime(v)) {
                res = v;
            }
        }
        return res;
    }
}
