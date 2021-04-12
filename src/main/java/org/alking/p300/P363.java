package org.alking.p300;

public class P363 {

    public int maxSumSubmatrix(int[][] matrix, int k) {

        int row = matrix.length;
        int col = matrix[0].length;

        // 每一行的前缀和
        int[][] prefixSum = new int[row][col+1];
        for(int i =0;i < row;i++){
            int[] s = new int[col+1];
            int sum = 0;
            s[0] = 0;
            for(int j = 0; j < col;j++) {
                sum += matrix[i][j];
                s[j + 1] = sum;
            }
            prefixSum[i] = s;
        }
        //


        return 0;

    }

}
