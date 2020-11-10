package org.alking.p800;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P819 {

    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> banSet = new HashSet<>();
        for (String b : banned) {
            banSet.add(b);
        }

        paragraph = paragraph.toLowerCase();

        HashMap<String, Integer> countMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] arr = paragraph.split("[!?',;. ]");
        for (String s : arr) {
            if (!s.equals("") && !banSet.contains(s)) {
                countMap.put(s, countMap.getOrDefault(s, 0) + 1);
            }
        }
        int max = 0;
        String t = null;
        for (Map.Entry<String, Integer> e : countMap.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                t = e.getKey();
            }
        }
        return t;
    }
}
