package org.alking.array;

public class RotateMatrix {


    public void rotate(int[][] matrix) {

        // step 1
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                int t = matrix[i][j];
                matrix[i][j]= matrix[size-1-j][size-1-i];
                matrix[size-1-j][size-1-i] = t;
            }
        }

        // step 2
        for(int i=0;i < size /2;i++){
            int[] t = matrix[i];
            matrix[i] = matrix[size-1-i];
            matrix[size-1-i] = t;
        }
    }
}
