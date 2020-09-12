package org.alking.p1700;


public class P1747 {

    public int[] masterMind(String solution, String guess) {

        int hit = 0;
        int size = solution.length();
        int[] pos = new int[size];
        int[] arr = new int['Z' - 'A' + 1];

        for (int i = 0; i < size; i++) {

            char a = solution.charAt(i);
            char b = guess.charAt(i);
            if (a == b) {
                pos[i] = 1;
                hit += 1;
            } else {
                arr[a - 'A'] += 1;
            }

        }
        int s = 0;
        for (int i = 0; i < size; i++) {

            if (pos[i] > 0) {
                continue;
            }
            char b = guess.charAt(i);
            if (arr[b - 'A'] > 0) {
                s += 1;
                arr[b - 'A'] -= 1;
            }

        }
        return new int[]{hit, s};
    }
}
