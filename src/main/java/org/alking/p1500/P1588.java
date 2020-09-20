package org.alking.p1500;

public class P1588 {


    public int sumOddLengthSubarrays(int[] arr) {

        int size = arr.length;
        int[] sumArr = new int[1 + size];
        int sum = 0;
        for (int idx = 0; idx < size; idx++) {
            sum += arr[idx];
            sumArr[idx + 1] = sum;
        }
        int result = 0;
        for (int idx = 0; idx < sumArr.length; idx++) {
            for (int i = idx + 1; i < sumArr.length; i += 2) {
                sum = sumArr[i] - sumArr[idx];
                result += sum;
            }

        }
        return result;
    }
}
