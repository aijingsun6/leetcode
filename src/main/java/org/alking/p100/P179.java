package org.alking.p100;

import java.util.Arrays;
import java.util.Comparator;

public class P179 {

    public String largestNumber(int[] nums) {
        String[] ns = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ns[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ns, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(0);
                char c2 = o2.charAt(0);
                if (c1 == c2) {
                    if (o1.length() == o2.length()) {
                        return o2.compareTo(o1);
                    } else {
                        return (o2 + o1).compareTo(o1 + o2);
                    }
                }
                return c2 - c1;
            }
        });
        StringBuilder sb = new StringBuilder();
        boolean zero = true;
        for (String s : ns) {
            if ("0".equals(s) && zero) {
                continue;
            }
            if (!"0".equals(s)) {
                zero = false;
            }
            sb.append(s);

        }
        String result = sb.toString();
        if (result.length() == 0) {
            return "0";
        }
        return sb.toString();
    }

}
