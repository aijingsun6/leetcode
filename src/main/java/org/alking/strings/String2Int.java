package org.alking.strings;

public class String2Int {

    public int myAtoi(String str) {

        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        char[] arr = str.toCharArray();
        char f = arr[0];
        // 默认正数
        boolean sign = true;
        int start = 0;
        if (f == '-') {
            sign = false;
            start = 1;
        } else if (f == '+') {
            start = 1;
        } else if (!Character.isDigit(f)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < arr.length; i++) {
            char c = arr[i];
            if (!Character.isDigit(c)) {
                break;
            } else {
                sb.append(c);
            }
        }
        String s = sb.toString();
        if (s.isEmpty()) {
            return 0;
        }
        try {
            Long l = Long.valueOf(s);
            if (!sign) {
                l = -l;
            }
            if (l < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (l > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return l.intValue();
        } catch (Exception e) {

        }
        if (sign) {
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }
}
