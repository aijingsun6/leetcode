package org.alking.p800;

import java.util.Arrays;
import java.util.Comparator;

public class P853 {

    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        int[][] cars = new int[N][2];
        double[] time = new double[N];
        for (int i = 0; i < N; i++) {
            cars[i] = new int[]{i, position[i]};
            time[i] = ((double) (target - position[i])) / speed[i];
        }
        Arrays.sort(cars, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int result = N;

        for (int i = N - 1; i > 0; i--) {
            int idx = cars[i][0];
            int idx2 = cars[i-1][0];
            if(position[idx2] == position[idx]){
                result --;
                time[idx2] = Math.max(time[idx2],time[idx]);
            }else if(time[idx2] <= time[idx]){
                result --;
                time[idx2] = time[idx];
            }
        }
        return result;
    }
}
