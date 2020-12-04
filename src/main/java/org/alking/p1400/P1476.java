package org.alking.p1400;

import java.util.ArrayList;

public class P1476 {

    class SubrectangleQueries {

        private int[][] matrix;

        private ArrayList<int[]> his = new ArrayList<>();

        public SubrectangleQueries(int[][] rectangle) {
            this.matrix = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            this.his.add(new int[]{row1, col1, row2, col2, newValue});
        }

        public int getValue(int row, int col) {

            for (int i = his.size() - 1; i >= 0; i--) {
                int[] ope = his.get(i);
                int r1 = ope[0];
                int c1 = ope[1];
                int r2 = ope[2];
                int c2 = ope[3];
                if(r1 <= row && row <= r2 && c1 <= col && col <= c2){
                    return ope[4];
                }

            }
            return matrix[row][col];
        }
    }

}
