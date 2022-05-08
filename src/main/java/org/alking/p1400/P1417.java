package org.alking.p1400;

public class P1417 {

    public String reformat(String s) {

        final int N = s.length();

        if (N == 0) {
            return "";
        }
        char[] letterArray = new char[N];
        int letterIdx = 0;
        char[] digitArray = new char[N];
        int digitIdx = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digitArray[digitIdx++] = c;
            } else if (Character.isLetter(c)) {
                letterArray[letterIdx++] = c;
            }
        }

        if (Math.abs(letterIdx - digitIdx) > 1) {
            return "";
        }
        char[] arr = new char[N];
        if (letterIdx > digitIdx) {

            for (int i = 0; i < letterIdx; i++) {
                arr[i * 2] = letterArray[i];
            }
            for (int i = 0; i < digitIdx; i++) {
                arr[i * 2 + 1] = digitArray[i];
            }

        } else {
            for (int i = 0; i < digitIdx; i++) {
                arr[i * 2] = digitArray[i];
            }
            for (int i = 0; i < letterIdx; i++) {
                arr[i * 2 + 1] = letterArray[i];
            }
        }

        return new String(arr);
    }
}
