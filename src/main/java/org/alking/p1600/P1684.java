package org.alking.p1600;

public class P1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        int[] bucket = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            bucket[allowed.charAt(i) - 'a']++;
        }
        int acc = 0;
        for (String w : words) {
            boolean allow = true;
            for (char c : w.toCharArray()) {
                if (bucket[c - 'a'] < 1) {
                    allow = false;
                    break;
                }
            }

            if (allow) {
                acc++;
            }
        }
        return acc;
    }
}
