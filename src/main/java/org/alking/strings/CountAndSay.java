package org.alking.strings;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {


    private String say(String s) {

        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {

            char c = cs[i];
            int count = 1;
            for (int j = i + 1; j < cs.length; j++) {
                if (cs[j] == c) {
                    count += 1;
                    i += 1;
                } else {
                    break;
                }
            }
            sb.append(String.valueOf(count)).append(c);
        }
        return sb.toString();
    }

    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        List<String> acc = new ArrayList<>(n);
        acc.add("1");
        acc.add("1");
        for (int i = 2; i <= n; i++) {
            String s = acc.get(i - 1);
            String say = say(s);
            acc.add(say);
        }
        return acc.get(n);
    }

}
