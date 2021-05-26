package org.alking.offer;

public class O5 {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
