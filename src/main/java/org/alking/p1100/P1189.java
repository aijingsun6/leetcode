package org.alking.p1100;

public class P1189 {

    public int maxNumberOfBalloons(String text) {
        int[] bucket = new int['z' - 'a' + 1];
        for (int i = 0; i < text.length(); i++) {
            bucket[text.charAt(i) - 'a']++;
        }
        final String balloon = "balon";
        bucket['l' - 'a'] /= 2;
        bucket['o' - 'a'] /= 2;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < balloon.length();i++){
            min = Math.min(min,bucket[balloon.charAt(i)-'a']);
        }
        return min;
    }
}
