package org.alking.p1300;

public class P1304 {


    public int[] sumZero(int n) {

        int[] result = new int[n];
        int m = n / 2;
        int idx = 0;
        for(int i = 1; i <= m; i++){
            result[idx] = i;
            result[idx+1] = -i;
            idx += 2;
        }
        return result;
    }
}
