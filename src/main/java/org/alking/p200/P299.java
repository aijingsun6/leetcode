package org.alking.p200;

public class P299 {

    public String getHint(String secret, String guess) {
        int[] arr = new int['9' + 1];
        char[] ac1 = secret.toCharArray();
        char[] ac2 = guess.toCharArray();
        for (char c : ac1) {
            arr[c] += 1;
        }
        int bulls = 0;
        int total = 0;
        for (int i = 0; i < ac1.length; i++) {
            char c1 = ac1[i];
            char c2 = ac2[i];
            if (c1 == c2) {
                bulls++;
            }
            if (arr[c2] > 0) {
                total++;
                arr[c2]--;
            }
        }
        return String.format("%dA%dB", bulls, total - bulls);
    }
}
