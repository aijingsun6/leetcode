package org.alking.p1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P1408 {

    public List<String> stringMatching(String[] words) {

        List<String> acc = new ArrayList<>();
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        final int N = words.length;
        ;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (words[j].contains(words[i])) {
                    acc.add(words[i]);
                    break;
                }
            }
        }
        return acc;
    }
}
