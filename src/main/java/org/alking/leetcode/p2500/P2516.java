package org.alking.leetcode.p2500;

public class P2516 {

    public int takeCharacters(String s, int k) {
        final int N = s.length();
        boolean find = false;
        int res = N;
        int ptr = 0;
        int[] cnt = new int[3];
        while (ptr < N) {
            cnt[s.charAt(ptr) - 'a']++;
            ptr++;
            if (checkCond(cnt, k)) {
                res = ptr;
                find = true;
                break;
            }
        }
        if (!find) {
            return -1;
        }

        int right = N;
        int c = res;
        for (int left = ptr - 1; left >= 0; left--) {
            cnt[s.charAt(left) - 'a']--;
            c--;
            while (!checkCond(cnt, k) && right > 0) {
                right--;
                cnt[s.charAt(right) - 'a']++;
                c++;
            }
            res = Math.min(res, c);
        }
        return res;
    }

    private boolean checkCond(int[] cnt, int k) {
        for (int v : cnt) {
            if (v < k) {
                return false;
            }
        }
        return true;
    }
}
