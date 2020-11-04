package org.alking.p700;

import java.util.HashMap;
import java.util.HashSet;


public class P720 {

    public String longestWord(String[] words) {
        prefixSet.clear();
        map.clear();
        res = "";
        // build map
        for (String s : words) {
            if (s.length() == 1) {
                prefixSet.add(s);
            } else {
                String prefix = s.substring(0, s.length() - 1);
                HashSet<String> set = map.getOrDefault(prefix, new HashSet<>());
                set.add(s);
                map.put(prefix, set);
            }
        }
        for (String prefix : prefixSet) {
            dfs(prefix);
        }
        return res;

    }

    final HashSet<String> prefixSet = new HashSet<>();
    final HashMap<String, HashSet<String>> map = new HashMap<>();
    String res;

    private void dfs(String prefix) {
        HashSet<String> set = map.get(prefix);
        if (set == null) {
            if (res.length() < prefix.length()) {
                res = prefix;
            } else if (res.length() == prefix.length() && prefix.compareTo(res) < 0) {
                res = prefix;
            }
            return;
        }
        for (String s : set) {
            dfs(s);
        }
    }
}
