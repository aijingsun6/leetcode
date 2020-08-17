package org.alking.p200;

public class P299 {

    public String getHint(String secret, String guess) {
        int[] arr = new int[10];
        char[] ac1 = secret.toCharArray();
        char[] ac2 = guess.toCharArray();
        for (char c : ac1) {
            arr[c - '0'] += 1;
        }
        int same = 0;
        int total = 0;
        for (int i = 0; i < ac1.length; i++) {
            char c1 = ac1[i];
            char c2 = ac2[i];
            if (c1 == c2) {
                same += 1;
            }
            int idx = c2 - '0';
            if (arr[idx] > 0) {
                total += 1;
                arr[idx] --;
            }
        }
        return String.format("%dA%dB", same, total - same);
    }
}
