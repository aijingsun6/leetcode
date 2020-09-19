package org.alking.p600;

public class P661 {

    public int[][] imageSmoother(int[][] M) {

        int iMax = M.length;
        int jMax = M[0].length;
        int[][] result = new int[iMax][jMax];

        for (int i = 0; i < iMax; i++) {
            result[i] = new int[jMax];
            for (int j = 0; j < jMax; j++) {

                int num = 0;
                int sum = 0;
                for (int ii = i - 1; ii <= i + 1; ii++) {

                    for (int jj = j - 1; jj <= j + 1; jj++) {

                        if (ii >= 0 && ii < iMax && jj >= 0 && jj < jMax) {
                            num += 1;
                            sum += M[ii][jj];
                        }


                    }

                }
                result[i][j] = sum / num;
            }
        }

        return result;
    }
}
