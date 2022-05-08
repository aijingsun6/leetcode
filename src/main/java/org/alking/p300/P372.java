package org.alking.p300;

public class P372 {

    private static final int MOD = 1337;

    private int pow(int a, int b){
        int result = 1;
        for(int i = 0; i < b;i ++){
            result = (result*a)% MOD;
        }
        return result;
    }

    public int superPow(int a, int[] b) {
        a = a % MOD;
        if (a < 2) {
            return 1;
        }
        int p = a;
        int result = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            result = (result* pow(p,b[i])) % MOD;
            p = pow(p,10);
        }
        return result;
    }
}
