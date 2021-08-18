package org.alking.p1500;

import java.util.HashMap;
import java.util.Map;

public class P1507 {

    private static final String[] MONTH = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private static final Map<String, String> dayMap = new HashMap<>();

    private static final Map<String, String> monthMap = new HashMap<>();

    static {

        // init day
        for (int i = 1; i <= 31; i++) {
            if (i < 10) {
                dayMap.put(String.format("%dth", i), "0" + i);
            } else {
                dayMap.put(String.format("%dth", i), "" + i);
            }
        }
        // init month
        for (int i = 1; i <= 12; i++) {
            if (i < 10) {
                monthMap.put(MONTH[i - 1], "0" + i);
            } else {
                monthMap.put(MONTH[i - 1], "" + i);
            }
        }

    }

    public String reformatDate(String date) {
        String[] split = date.split(" ");
        return split[2] +"-"+ monthMap.get(split[1]) +"-"+ dayMap.get(split[0]);
    }
}
