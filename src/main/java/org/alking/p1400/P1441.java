package org.alking.p1400;

import java.util.ArrayList;
import java.util.List;

public class P1441 {

    public List<String> buildArray(int[] target, int n) {
        List<String> acc = new ArrayList<>();
        int m = 1;
        int i = 0;
        while ( i < target.length && m <= n){
            int v = target[i];
            while (m != v) {
                acc.add("Push");
                acc.add("Pop");
                m += 1;
            }
            acc.add("Push");
            m += 1;
            i += 1;
        }
        return acc;
    }
}
