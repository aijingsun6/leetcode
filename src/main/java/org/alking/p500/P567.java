package org.alking.p500;

import java.util.Arrays;

public class P567 {

    public boolean checkInclusion(String s1, String s2) {
        int size = 'z' - 'a' + 1;
        int[] freq = new int[size];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] wndFreq = new int[size];
        int left = 0;
        int right = 0;
        int cnt = 0;
        int total = s1.length();
        while (right < s2.length()) {

            char c = s2.charAt(right);
            int idx = c - 'a';
            if (freq[c - 'a'] < 1) {
                left = right + 1;
                right = right + 1;
                Arrays.fill(wndFreq,0);
                cnt = 0;
                continue;
            }
            while (wndFreq[idx] == freq[idx]){
                int idx2 = s2.charAt(left) - 'a';
                wndFreq[idx2] --;
                cnt --;
                left += 1;
            }
            wndFreq[idx]++;
            cnt ++;
            if (cnt >= total) {
                return true;
            }
            right ++;
        }
        return false;
    }
}
