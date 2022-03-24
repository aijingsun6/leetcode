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

    public int[][] imageSmoother2(int[][] mat) {
        final int ROW = mat.length;
        final int COL = mat[0].length;
        int[][] result = new int[ROW][COL];
        int[][] pre = new int[ROW][COL + 1];
        for (int i = 0; i < ROW; i++) {
            int[] arr = new int[COL + 1];
            int sum = 0;
            for (int j = 0; j < COL; j++) {
                sum += mat[i][j];
                arr[j + 1] = sum;
            }
            pre[i] = arr;
        }
        for (int i = 0; i < ROW; i++) {
            int[] arr = new int[COL];
            for (int j = 0; j < COL; j++) {
                int sum = 0;
                int num = 0;
                int left = Math.max(0, j - 1);
                int right = Math.min(j + 1, COL - 1);
                int cnt = (right - left + 1);
                // up
                if (i > 0) {
                    num += cnt;
                    sum += (pre[i - 1][right + 1] - pre[i - 1][left]);
                }
                num += cnt;
                sum += (pre[i][right + 1] - pre[i][left]);
                // down
                if (i < ROW - 1) {
                    num += cnt;
                    sum += (pre[i + 1][right + 1] - pre[i + 1][left]);
                }
                arr[j] = sum / num;
            }
            result[i] = arr;

        }
        return result;
    }
}
