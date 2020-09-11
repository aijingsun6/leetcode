package org.alking.p1100;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class P1128 {

    // m < n
    public static class Domino {

        private int m;
        private int n;

        public Domino(int m, int n) {
            if (m < n) {
                this.m = m;
                this.n = n;
            } else {
                this.m = n;
                this.n = m;
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Domino domino = (Domino) o;
            return m == domino.m &&
                    n == domino.n;
        }

        @Override
        public int hashCode() {
            return Objects.hash(m, n);
        }
    }

    public int numEquivDominoPairs(int[][] dominoes) {


        HashMap<Domino, Integer> map = new HashMap<>();

        for (int[] p : dominoes) {
            Domino d = new Domino(p[0], p[1]);
            map.put(d, map.getOrDefault(d, 0) + 1);
        }
        int sum = 0;

        for (Map.Entry<Domino, Integer> entry : map.entrySet()) {

            int v = entry.getValue();
            if (v > 1) {
                sum += (v * (v - 1)) / 2;
            }
        }
        return sum;
    }
}
