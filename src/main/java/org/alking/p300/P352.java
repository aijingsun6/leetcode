package org.alking.p300;

import java.util.Map;
import java.util.TreeMap;

public class P352 {


    public static class SummaryRanges {

        private final TreeMap<Integer, Integer> map = new TreeMap<>();

        public SummaryRanges() {

        }

        public void addNum(int val) {

            if (map.isEmpty()) {
                map.put(val, val);
                return;
            }
            if (map.containsKey(val)) {
                return;
            }
            Map.Entry<Integer, Integer> prev = map.floorEntry(val);
            int[] prevEntry = null;
            if (prev != null) {
                prevEntry = new int[]{prev.getKey(), prev.getValue()};
                if (prevEntry[1] == val - 1) {
                    prevEntry[1] = val;
                    map.put(prevEntry[0], val);
                }
            }

            if (map.containsKey(val + 1)) {
                int v = map.get(val + 1);
                map.remove(val + 1);
                if (prevEntry != null && prevEntry[1] == val) {
                    map.put(prevEntry[0],v);
                } else {
                    map.put(val, v);
                }
            } else if (prevEntry == null || prevEntry[1] < val) {
                map.put(val, val);
            }

        }

        public int[][] getIntervals() {

            int[][] res = new int[map.size()][2];
            int offset = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                res[offset++] = new int[]{e.getKey(), e.getValue()};
            }
            return res;
        }
    }


}
