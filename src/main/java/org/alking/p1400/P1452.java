package org.alking.p1400;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P1452 {

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        int N = favoriteCompanies.size();
        HashSet<String>[] sets = new HashSet[N];
        for (int i = 0; i < N; i++) {
            sets[i] = new HashSet<>(favoriteCompanies.get(i));
        }

        List<Integer> acc = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            boolean ok = true;
            for (int j = 0; j < N && ok; j++) {

                if (j == i) {
                    continue;
                }

                if(sets[j].containsAll(sets[i])){
                    ok = false;
                    break;
                }
            }
            if (ok) {
                acc.add(i);
            }
        }
        return acc;
    }
}
