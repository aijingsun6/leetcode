package org.alking.p1500;

public class P1572 {

    public int diagonalSum(int[][] mat) {

        if(mat == null || mat.length == 0){
            return 0;
        }
        if(mat.length == 1){
            return mat[0][0];
        }

        int iMax = mat.length;
        int jMax = mat[0].length;

        int j1 = 0;
        int j2 = jMax - 1;
        int sum = 0;
        for(int i = 0; i < iMax;i ++){
            sum += mat[i][i];
            sum += mat[j1][j2];
            j1 += 1;
            j2 -= 1;
        }
        if(iMax % 2 == 1){

            sum -= mat[iMax/2][iMax/2];
        }
        return sum;

    }
}
