package org.alking.p700;

public class P771 {

    public int numJewelsInStones(String J, String S) {

        boolean[] arr = new boolean['z' - 'A' + 1];

        for (char c : J.toCharArray()) {
            arr[c - 'A'] = true;
        }
        int sum = 0;
        for (char c : S.toCharArray()) {
            if (arr[c - 'A']) {
                sum += 1;
            }
        }
        return sum;

    }
}
