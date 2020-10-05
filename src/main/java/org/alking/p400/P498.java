package org.alking.p400;

public class P498 {

    public int[] findDiagonalOrder(int[][] matrix) {


        if(matrix == null || matrix.length == 0){
            return new int[0];
        }

        int iMax = matrix.length;
        int jMax = matrix[0].length;

        int[] result = new int[iMax * jMax];
        int idx = 0;

        for (int n = 0; n <= (iMax + jMax - 2); n++) {
            if (n % 2 == 0) {

                for (int j = 0; j <= n; j++) {
                    int i = n - j;
                    if(i >=0 && i < iMax && j >= 0 && j < jMax){
                        result[idx] = matrix[i][j];
                        idx += 1;
                    }
                }
            } else {

                for(int i = 0; i <= n;i++){
                    int j = n  - i;
                    if(i >=0 && i < iMax && j >= 0 && j < jMax){
                        result[idx] = matrix[i][j];
                        idx += 1;
                    }
                }

            }
        }
        return result;
    }

}
