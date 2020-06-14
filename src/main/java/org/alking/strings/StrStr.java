package org.alking.strings;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if(haystack.isEmpty() && needle.isEmpty()){
            return 0;
        }
        if (haystack.isEmpty()) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }

        if(haystack.length() < needle.length()){
            return -1;
        }
        if(haystack.length() == needle.length()){
            return haystack.equals(needle) ? 0: -1;
        }

        int size = needle.length();
        int max = haystack.length() - size + 1;
        for (int i = 0; i < max; i++) {
            String s = new String(haystack.toCharArray(),i, size);
            if(s.equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
