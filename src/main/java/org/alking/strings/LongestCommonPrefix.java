package org.alking.strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs== null || strs.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (true) {
            char c = 0;
            for (String s : strs) {
                if (s.length() <= idx) {
                    return sb.toString();
                }
                if (c == 0) {
                    c = s.charAt(idx);
                } else if (s.charAt(idx) != c) {
                    return sb.toString();
                }

            }
            sb.append(c);
            idx += 1;

        }
    }
}
