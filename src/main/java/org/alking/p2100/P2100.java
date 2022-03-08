package org.alking.p2100;

import java.util.ArrayList;
import java.util.List;

public class P2100 {

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        final int N = security.length;
        if (N < (time * 2 + 1)) {
            return new ArrayList<>(0);
        }
        ArrayList<Integer> acc = new ArrayList<>(security.length);
        if (time == 0) {
            for(int i = 0; i< security.length;i++){
                acc.add(i);
            }
            return acc;
        }
        int[] prefixDP = new int[security.length];
        prefixDP[0] = 0;
        for (int i = 1; i < security.length; i++) {
            if (security[i] > security[i - 1]) {
                prefixDP[i] = 0;
            } else {
                prefixDP[i] = prefixDP[i - 1] + 1;
            }
        }

        int[] suffixDP = new int[security.length];
        suffixDP[security.length - 1] = 0;
        for (int i = security.length - 2; i >= 0; i--) {
            if (security[i] > security[i + 1]) {
                suffixDP[i] = 0;
            } else {
                suffixDP[i] = suffixDP[i + 1] + 1;
            }
        }

        for (int i = 0; i < security.length; i++) {
            if (prefixDP[i] >= time && suffixDP[i] >= time) {
                acc.add(i);
            }
        }
        return acc;
    }
}
