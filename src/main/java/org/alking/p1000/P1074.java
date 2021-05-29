package org.alking.p1000;

import java.util.HashMap;

public class P1074 {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cntMap = new HashMap<>();
        cntMap.put(0, 1);
        int sum = 0;
        int t;
        int acc = 0;
        for (int v : nums) {
            sum += v;
            t = sum - k;
            if (cntMap.containsKey(t)) {
                acc += cntMap.get(t);
            }
            cntMap.put(sum, cntMap.getOrDefault(sum, 0) + 1);
        }
        return acc;
    }

    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        final int row = matrix.length;
        final int col = matrix[0].length;

        // 每行的前缀和
        final int[][] presum = new int[row + 1][col + 1];
        presum[0] = new int[col + 1];
        for (int i = 0; i < row; i++) {
            presum[i + 1] = new int[col + 1];
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
                presum[i + 1][j + 1] = sum;
            }
        }
        int acc = 0;
        for (int colStart = 0; colStart < col; colStart++) {
            for (int colEnd = colStart + 1; colEnd <= col; colEnd++) {
                int[] arr = new int[row];
                for(int r = 0; r < row;r++){
                    arr[r] = presum[r+1][colEnd] - presum[r+1][colStart];
                }
                acc += subarraySum(arr,target);
            }
        }
        return acc;
    }


}
