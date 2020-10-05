package org.alking.p1700;

public class P1721 {


    public void setZeroes(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return;
        }
        int iMax = matrix.length;
        int jMax = matrix[0].length;
        boolean[] row = new boolean[iMax];
        boolean[] col = new boolean[jMax];
        for(int i = 0; i < iMax;i ++){
            for(int j = 0; j < jMax;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < iMax;i++){
            if(row[i]){

                for(int j = 0; j < jMax;j++){
                    matrix[i][j]  = 0;
                }

            }
        }

        for(int j = 0; j < jMax;j++){
            if(col[j]){
                for(int i = 0; i < iMax;i++){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
