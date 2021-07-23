package org.alking.p1800;

public class P1876 {

    public int countGoodSubstrings(String s) {

        int acc = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] == arr[i + 1]) {
                continue;
            }
            if (arr[i] == arr[i + 2]) {
                continue;
            }
            if (arr[i + 1] == arr[i + 2]) {
                continue;
            }
            acc += 1;

        }
        return acc;
    }
}
