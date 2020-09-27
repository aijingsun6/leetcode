package org.alking.p200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P290 {

    public boolean wordPattern(String pattern, String str) {
        int patternSize = pattern.length();
        String[] arr = str.split(" ");
        if (arr.length != patternSize) {
            return false;
        }
        Map<Integer, Character> patternMap = new HashMap<>();
        for (int i = 0; i < patternSize; i++) {
            patternMap.put(i, pattern.charAt(i));
        }
        Map<Character, String> matchMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char c = patternMap.get(i);

            if (!matchMap.containsKey(c)) {
                matchMap.put(c, s);
                continue;
            }
            String exist = matchMap.get(c);
            if (!exist.equals(s)) {
                return false;
            }
        }
        Set<String> set = new HashSet<>();
        for (Map.Entry<Character, String> entry : matchMap.entrySet()) {
            String v = entry.getValue();
            if (set.contains(v)) {
                return false;
            }
            set.add(v);
        }
        return true;
    }
}
