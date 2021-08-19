package org.alking.p1700;

public class P1704 {

    private boolean check(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public boolean halvesAreAlike(String s) {

        int N = s.length();
        int cnt = 0;
        int half = N / 2;
        for (int i = 0; i < N; i++) {
            if (i < half) {
                if (check(s.charAt(i))) {
                    cnt++;
                }
            } else {
                if (check(s.charAt(i))) {
                    cnt--;
                }
            }
        }
        return cnt == 0;
    }
}
