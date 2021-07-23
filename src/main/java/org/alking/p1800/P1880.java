package org.alking.p1800;

public class P1880 {

    private int parseString(String s) {

        char[] arr = s.toCharArray();
        int acc = 0;
        int p = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            acc += p * (arr[i] - 'a');
            p *= 10;
        }
        return acc;

    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int first = parseString(firstWord);
        int sec = parseString(secondWord);
        int target = parseString(targetWord);
        return first + sec == target;


    }
}
