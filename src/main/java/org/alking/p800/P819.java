package org.alking.p800;

import java.util.HashMap;
import java.util.HashSet;

public class P819 {

    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> banSet = new HashSet<>();
        for (String b : banned) {
            banSet.add(b);
        }

        paragraph = paragraph.toLowerCase() + ".";

        HashMap<String, Integer> countMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char[] cs = paragraph.toCharArray();
        int max = 0;
        String t = null;
        for (char c : cs) {
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else {
                String s = sb.toString();
                if (!s.equals("") && !banSet.contains(s)) {
                    int count = countMap.getOrDefault(s, 0) + 1;
                    countMap.put(s, count);
                    if (count > max) {
                        max = count;
                        t = s;
                    }
                }
                sb = new StringBuilder();
            }
        }
        return t;
    }
}
