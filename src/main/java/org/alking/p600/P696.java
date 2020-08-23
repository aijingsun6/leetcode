package org.alking.p600;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/count-binary-substrings/">696. 计数二进制子串</a>
 */
public class P696 {


    public int countBinarySubstrings(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        List<Integer> counts = new ArrayList<>();

        char[] cs = s.toCharArray();
        char c = cs[0];
        int start = 0;
        for (int i = 0; i < cs.length; i++) {
            char ct = cs[i];
            if (ct != c) {
                counts.add(i - start);
                c = ct;
                start = i;
            }
        }
        counts.add(cs.length - start);

        int acc = 0;
        for( int i = 0; i < counts.size()-1;i++){

            int add = Math.min( counts.get(i),counts.get(i+1));
            acc += add;

        }
        return acc;

    }
}
