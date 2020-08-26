package org.alking.p0;

import java.util.*;

public class P17 {

    private static Map<Character, List<String>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }


    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }

        List<String> acc = new ArrayList<>();
        dfs("", digits, 0, acc);
        return acc;
    }


    private void dfs(String pre, String digits, int idx, List<String> acc) {

        if (idx == (digits.length() - 1)) {

            List<String> find = map.get(digits.charAt(idx));

            for (String s : find) {
                acc.add(pre + s);
            }

            return;
        }


        List<String> find = map.get(digits.charAt(idx));

        for (String s : find) {
            dfs(pre + s, digits, idx + 1, acc);
        }
    }

}
