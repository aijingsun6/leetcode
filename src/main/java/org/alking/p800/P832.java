package org.alking.p800;

public class P832 {


    public int[][] flipAndInvertImage(int[][] A) {

        if(A == null || A.length == 0){
            return null;
        }

        int iMax = A.length;
        int jMax = A[0].length;

        int[][] acc = new int[iMax][jMax];
        for(int i = 0; i < iMax;i ++){

            for( int j = 0; j < jMax; j ++){

                acc[i][j] = A[i][jMax-1-j] == 1 ? 0: 1;

            }
        }

        return acc;

    }
}
