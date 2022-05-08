package org.alking.p1600;

import java.util.ArrayList;
import java.util.List;

public class P1694 {

    public String reformatNumber(String number) {

        final int N = number.length();
        char[] array = new char[N];
        int offset = 0;
        for (int i = 0; i < N; i++) {
            char c = number.charAt(i);
            if (Character.isDigit(c)) {
                array[offset++] = c;
            }
        }
        List<String> list = new ArrayList<>();
        if (offset % 3 == 0) {
            for (int i = 0; i < offset; i += 3) {
                list.add(new String(array, i, 3));
            }
        } else if (offset % 3 == 1) {
            int cnt = offset / 3 - 1;
            int idx = 0;
            for(int i = 0; i < cnt; i++){
                list.add(new String(array,idx,3));
                idx += 3;
            }
            list.add(new String(array,idx,2));
            idx += 2;
            list.add(new String(array,idx,2));
        } else {
            int cnt = offset/3;
            int idx = 0;
            for(int i = 0; i < cnt; i++){
                list.add(new String(array,idx,3));
                idx += 3;
            }
            list.add(new String(array,idx,2));
        }

        return String.join("-",list);
    }
}
