package org.alking.p1800;

import java.util.TreeMap;

public class P1859 {

    public String sortSentence(String s) {

        String[] array = s.split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (String e : array) {
            int start = 0;
            while (Character.isLetter(e.charAt(start))) {
                start++;
            }
            String v = e.substring(0, start);
            String k = e.substring(start, e.length());
            map.put(Integer.valueOf(k), v);
        }
        return String.join(" ", map.values());
    }
}
