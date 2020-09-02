package org.alking.p1500;

public class P1587 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return false;
        }

        int iMax = matrix.length;
        int jMax = matrix[0].length;

        int start;

        // 第一步，裁切
        int rowStart = -1;
        int rowEnd = 0;
        for (int i = 0; i < iMax; i++) {
            start = matrix[i][0];
            if (start == target) {
                return true;
            }
            if (start > target) {
                break;
            }
            if (rowStart < 0) {
                rowStart = i;
            }
            rowEnd = i;
        }

        int colStart = -1;
        int colEnd = 0;
        for (int j = 0; j < jMax; j++) {

            start = matrix[0][j];

            if (start == target) {
                return true;
            }
            if (start > target) {
                break;
            }
            if (colStart < 0) {
                colStart = j;
            }
            colEnd = j;
        }

        if (rowStart < 0 || colStart < 0) {
            return false;
        }

        for (int i = rowStart; i <= rowEnd; i++) {
            int idx = binarySearch(matrix[i], colStart, colEnd, target);
            if (idx >= 0) {
                return true;
            }

        }
        return false;
    }

    private int binarySearch(int[] arr, int start, int end, int target) {

        if (arr[start] == target) {
            return start;
        }

        if (arr[end] == target) {
            return end;
        }

        if (arr[start] > target || arr[end] < target) {
            return -1;
        }

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (arr[start] == target) {
            return start;
        }
        return -1;

    }
}
