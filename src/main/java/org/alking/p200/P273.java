package org.alking.p200;

import java.util.ArrayList;

public class P273 {

    private static final String[] LESS_20 = new String[]{
            "",
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"
    };

    private static final String[] MIDDLE = new String[]{
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String HUNDRED = "Hundred";

    private String lessThousand(int num) {
        if (num < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        boolean hundred = false;
        if (num >= 100) {
            // hundred
            hundred = true;
            sb.append(LESS_20[num / 100]).append(" ").append(HUNDRED);
            num = num % 100;
        }
        if (num >= 20) {
            int n = num / 10;
            if (hundred) {
                sb.append(" ").append(MIDDLE[n]);
            } else {
                sb.append(MIDDLE[n]);
            }

            num = num - 10 * n;
            if (num > 0) {
                sb.append(" ")
                        .append(LESS_20[num]);
            }
        } else if (num > 0) {
            if (hundred) {
                sb.append(" ").append(LESS_20[num]);
            } else {
                sb.append(LESS_20[num]);
            }
        }
        return sb.toString();
    }

    public String numberToWords(int num) {
        if (num < 1) {
            return "Zero";
        }
        String[] split = new String[]{"", "Thousand", "Million", "Billion", "Trillion"};
        ArrayList<String[]> arr = new ArrayList<>();
        int idx = 0;
        while (num > 0) {
            int n = num % 1000;
            String s = lessThousand(n);
            arr.add(new String[]{s, split[idx]});
            idx += 1;
            num = num / 1000;
        }

        StringBuilder sb = new StringBuilder();
        boolean first = false;
        for (int i = arr.size() - 1; i >= 0; i--) {
            String[] ss = arr.get(i);
            if (!ss[0].isEmpty() && !first) {
                sb.append(ss[0]);
                if(!ss[1].isEmpty()){
                    sb.append(" ").append(ss[1]);
                }
                first = true;
            } else if (!ss[0].isEmpty()) {
                sb.append(" ").append(ss[0]);
                if(!ss[1].isEmpty()){
                    sb.append(" ").append(ss[1]);
                }
            }
        }
        return sb.toString();
    }
}
