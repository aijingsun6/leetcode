package org.alking.p400;


public class P459 {

    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int size = s.length();
        if (size == 1) {
            return false;
        }
        int mod;
        int repeat;
        int loopEnd = size;
        for (int i = 1; i <= loopEnd; i++) {
            mod = size % i;
            if (mod == 0) {
                repeat = size / i;
                if (repeat < 2) {
                    break;
                }
                if (repeat < loopEnd) {
                    loopEnd = repeat;
                }
                if (checkString(s, i, repeat)) {
                    return true;
                }
                if (checkString(s, repeat, i)) {
                    return true;
                }

            }
        }
        return false;
    }

    private boolean checkString(final String str, final int per, final int repeat) {

        if (repeat < 2) {
            return false;
        }
        final String first = str.substring(0, per);
        int start = 0;
        int end;
        String tmpS;
        for (int j = 1; j < repeat; j++) {
            start = start + per;
            end = start + per;
            tmpS = str.substring(start, end);
            if (!tmpS.equals(first)) {
                return false;
            }
        }
        return true;
    }
}
