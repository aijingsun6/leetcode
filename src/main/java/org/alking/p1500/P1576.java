package org.alking.p1500;

public class P1576 {

    private char nextChar(char[] arr) {
        for (char r = 'a'; r <= 'z'; r++) {
            boolean eq = false;
            for (char c : arr) {
                if (r == c) {
                    eq = true;
                }
            }
            if (!eq) {
                return r;
            }
        }
        return 'a';
    }

    public String modifyString(String s) {


        int N = s.length();
        if (N < 1) {
            return "";
        }
        char[] array = s.toCharArray();
        for (int i = 0; i < N; i++) {
            char c = array[i];
            if (c == '?') {
                if (i == 0) {
                    //first
                    if (i + 1 == N) {
                        array[i] = 'a';
                    } else if (array[i + 1] == '?') {
                        array[i] = 'a';
                    } else {
                        array[i] = nextChar(new char[]{array[i + 1]});
                    }
                    continue;
                }
                if (i + 1 == N) {
                    // last
                    array[i] = nextChar(new char[]{array[i - 1]});
                    continue;
                }

                if (array[i + 1] == '?') {
                    array[i] = nextChar(new char[]{array[i - 1]});
                } else {
                    array[i] = nextChar(new char[]{array[i - 1], array[i + 1]});
                }
            }

        }
        return new String(array);

    }
}
