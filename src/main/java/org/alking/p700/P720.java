package org.alking.p700;

import java.util.HashMap;
import java.util.HashSet;


public class P720 {

    public static class TNode {

        TNode[] children = new TNode[26];

        String s;

        boolean leaf;

    }

    public String longestWord2(String[] words) {
        TNode root = new TNode();
        for (String s : words) {
            if (s.isEmpty()) {
                continue;
            }
            TNode n = root;
            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                if (n.children[idx] == null) {
                    n.children[idx] = new TNode();
                }
                n = n.children[idx];
            }
            n.leaf = true;
            n.s = s;
        }
        result = "";
        max = 0;
        for (TNode n : root.children) {
            dfs(n);
        }
        return result;

    }

    private String result = "";
    private int max = 0;

    private void dfs(TNode n) {
        if (n == null || !n.leaf) {
            return;
        }
        if (n.s.length() > max) {
            result = n.s;
            max = n.s.length();
        } else if (n.s.length() == max && n.s.compareTo(result) < 0) {
            result = n.s;
        }
        for (TNode tn : n.children) {
            dfs(tn);
        }
    }


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
