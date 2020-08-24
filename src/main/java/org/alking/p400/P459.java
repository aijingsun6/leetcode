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
        int mod = 0;
        int repeat = 0;
        String firstS = "";
        String tmpS = "";
        int start = 0;
        int end = 0;
        boolean match = false;
        int loopEnd = size / 2;
        for (int i = 1; i <= loopEnd; i++) {
            mod = size % i;
            if (mod == 0) {
                repeat = size / i;
                if (repeat < 2) {
                    break;
                }
                firstS = s.substring(0, i);
                match = true;
                start = 0;
                for (int j = 1; j < repeat; j++) {
                    start = start + i;
                    end = start + i;
                    tmpS = s.substring(start, end);
                    if (!tmpS.equals(firstS)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}
