package org.alking.p1600;

public class P1646 {

    public int getMaximumGenerated(int n) {
        if(n == 0){
            return 0;
        }

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                int j = i / 2;
                arr[i] = arr[j] + arr[j + 1];
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }
}
