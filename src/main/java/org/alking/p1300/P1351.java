package org.alking.p1300;

public class P1351 {


    public int countNegatives(int[][] grid) {

        int sum = 0;

        for(int[] arr: grid){
            sum += findNeg(arr);
        }

        return sum;
    }

    private int findNeg(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        if (arr[left] < 0) {
            return arr.length;
        }
        if (arr[right] >= 0) {
            return 0;
        }


        // find first nega
        // arr[left] >= 0
        // arr[right] < 0
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] < 0){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        // left >= right
        if(arr[left] < 0){
            return arr.length - left;
        }
        return arr.length - left -1;
    }
}
