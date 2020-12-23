package org.alking.p300;

public class P387 {

    public int firstUniqChar(String s) {
        int[] bucket = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (bucket[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
