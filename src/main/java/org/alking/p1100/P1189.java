package org.alking.p1100;

public class P1189 {

    public int maxNumberOfBalloons(String text) {
        int[] bucket = new int['z' + 1];
        for (char c : text.toCharArray()) {
            bucket[c]++;
        }
        bucket['l'] /= 2;
        bucket['o'] /= 2;
        final String balloon = "balon";
        int min = Integer.MAX_VALUE;
        for (char c : balloon.toCharArray()) {
            min = Math.min(min, bucket[c]);
        }
        return min;
    }
}
