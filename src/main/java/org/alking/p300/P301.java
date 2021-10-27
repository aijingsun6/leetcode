package org.alking.p300;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P301 {

    private int max = 0;
    private final HashSet<String> result = new HashSet<>();
    private char[] array;
    private int ptr = 0;
    private int cnt = 0;

    public List<String> removeInvalidParentheses(String s) {
        max = 0;
        result.clear();
        array = new char[s.length()];
        ptr = 0;
        cnt = 0;
        backtrace(0, s);
        return new ArrayList<>(result);
    }

    private void backtrace(int offset, String s) {

        if (offset == s.length()) {

            if (cnt == 0) {
                // valid string
                if (ptr > max) {
                    max = ptr;
                    result.clear();
                    result.add(new String(array, 0, ptr));
                } else if (ptr == max) {
                    result.add(new String(array, 0, ptr));
                }
            }

            return;
        }


        char c = s.charAt(offset);
        if (c == '(') {
            // delete
            backtrace(offset + 1, s);

            array[ptr++] = c;
            cnt++;
            backtrace(offset + 1, s);
            ptr--;
            cnt--;
        } else if (c == ')') {
            //delete
            backtrace(offset + 1, s);

            if (cnt > 0) {
                array[ptr++] = c;
                cnt--;
                backtrace(offset + 1, s);
                ptr--;
                cnt++;
            }

        } else {
            array[ptr++] = c;
            backtrace(offset + 1, s);
            ptr--;
        }
    }
}
