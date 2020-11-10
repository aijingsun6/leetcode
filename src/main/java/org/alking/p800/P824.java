package org.alking.p800;

import java.util.ArrayList;
import java.util.Arrays;

public class P824 {

    private boolean isSpe(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String toGoatLatin(String s) {
        String[] array = s.split("\\s");
        char[] copy = new char[array.length + 1];
        Arrays.fill(copy, 'a');
        ArrayList<String> acc = new ArrayList<>();
        for (int idx = 0; idx < array.length; idx++) {
            String e = array[idx];
            char f = e.charAt(0);
            if (isSpe(f)) {
                e = e + "ma";
            } else {
                e = e.substring(1) + f + "ma";
            }
            e = e + String.copyValueOf(copy, 0, idx + 1);
            acc.add(e);
        }
        return String.join(" ", acc);
    }

}
