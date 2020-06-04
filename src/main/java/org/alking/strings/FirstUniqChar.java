package org.alking.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    public int firstUniqChar(String s) {

        char[] cs = s.toCharArray();
        Map<Character, Integer> cm = new HashMap<>();
        for (int i = 0; i < cs.length; i++) {

            char c = cs[i];
            if (cm.containsKey(c)) {
                cm.put(c, -1);
            } else {
                cm.put(c, i);
            }
        }

        int min = cs.length;
        for (Map.Entry<Character, Integer> entry : cm.entrySet()) {
            int idx = entry.getValue();
            if (idx >= 0 && idx < min) {
                min = idx;
            }
        }
        if (min < cs.length) {
            return min;
        }
        return -1;
    }
}
