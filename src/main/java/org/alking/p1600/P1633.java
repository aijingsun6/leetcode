package org.alking.p1600;

public class P1633 {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int iMax = matrix.length;
        int jMax = matrix[0].length;
        boolean[][] visit = new boolean[iMax][jMax];
        for(int i = 0; i < iMax;i++){
            visit[i] = new boolean[jMax];
        }

        int[] result = new int[iMax * jMax];
        int idx = 0;
        int i = 0;
        int j = 0;
        Direction direction = Direction.RIGHT;

        while (true) {

            if (i < 0 || i >= iMax) {
                break;
            }
            if (j < 0 || j >= jMax) {
                break;
            }

            if (visit[i][j]) {
                break;
            }

            result[idx] = matrix[i][j];
            idx += 1;
            visit[i][j] = true;
            switch (direction) {

                case RIGHT:

                    if (j < jMax - 1 && !visit[i][j + 1]) {
                        j = j + 1;
                    } else {
                        i = i + 1;
                        direction = Direction.DOWN;
                    }
                    break;

                case DOWN:
                    if (i < iMax - 1 && !visit[i + 1][j]) {
                        i = i + 1;
                    } else {
                        j = j - 1;
                        direction = Direction.LEFT;
                    }
                    break;
                case LEFT:
                    if (j > 0 && !visit[i][j - 1]) {
                        j = j - 1;
                    } else {
                        i = i - 1;
                        direction = Direction.UP;
                    }
                    break;
                case UP:
                    if (i > 0 && !visit[i - 1][j]) {
                        i = i - 1;
                    } else {
                        j = j + 1;
                        direction = Direction.RIGHT;
                    }
                    break;
                default:
                    break;


            }

        }

        return result;

    }
}
