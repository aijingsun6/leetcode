package org.alking.p800;

import java.util.ArrayList;
import java.util.HashMap;

public class P893 {

    public int numSpecialEquivGroups(String[] A) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        int acc = 0;
        for (String s : A) {

            int size = s.length();
            ArrayList<String> list = map.get(size);
            if (list == null) {
                list = new ArrayList<>();
                map.put(size, list);
            }
            boolean add = true;
            for (String e : list) {
                if (strEqual(e, s)) {
                    add = false;
                    break;
                }
            }
            if (add) {
                list.add(s);
                acc += 1;
            }
        }
        return acc;
    }

    public boolean strEqual(final String s1, final String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] arr1 = new int['z' - 'a' + 1];
        int[] arr2 = new int['z' - 'a' + 1];
        for (int i = 0; i < s1.length(); i += 2) {
            char c = s1.charAt(i);
            arr1[c - 'a'] += 1;
        }
        for (int i = 1; i < s1.length(); i += 2) {
            char c = s1.charAt(i);
            arr2[c - 'a'] += 1;
        }

        for (int i = 0; i < s2.length(); i += 2) {
            char c = s2.charAt(i);
            if (--arr1[c - 'a'] < 0) {
                return false;
            }
        }
        for (int i = 1; i < s2.length(); i += 2) {
            char c = s2.charAt(i);
            if (--arr2[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
