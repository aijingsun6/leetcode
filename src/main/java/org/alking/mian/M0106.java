package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/compress-string-lcci/
 */
public class M0106 {

    public String compressString(String S) {

        StringBuilder sb = new StringBuilder();
        char lastC = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (lastC == 0) {
                lastC = c;
                count = 1;
            } else if (c == lastC) {
                count += 1;
            } else {
                sb.append(lastC);
                sb.append(count);
                lastC = c;
                count = 1;
            }
        }
        if (lastC > 0) {
            sb.append(lastC);
            sb.append(count);
        }

        String to = sb.toString();
        if (to.length() < S.length()) {
            return to;
        }
        return S;
    }
}
