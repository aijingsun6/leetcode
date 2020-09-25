package org.alking.p0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P12 {


    private static final String[][] MAPS = new String[][]{

            // 0 - 9
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            // 00 - 90
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            // 00 - 900
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            // 000 - 3000
            {"", "M", "MM", "MMM"}


    };


    public String intToRoman(int num) {
        List<String> list = new LinkedList<>();
        int idx = 0;
        int t;
        while (num > 0) {
            t = num % 10;
            list.add(0, MAPS[idx][t]);
            num = num / 10;
            idx += 1;
        }

        return String.join("", list);
    }
}
