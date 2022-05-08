package org.alking.p2000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class P2034 {


    static class StockPrice {

        private final HashMap<Integer, Integer> tp = new HashMap<>();

        private final TreeMap<Integer, HashSet<Integer>> pt = new TreeMap<>();

        private int lastTs=0;

        private int lastPrice = 0;

        public StockPrice() {
        }

        public void update(int timestamp, int price) {

            Integer before = tp.getOrDefault(timestamp,null);
            if(before != null){
                HashSet<Integer> s = pt.get(before);
                s.remove(timestamp);
                if(s.isEmpty()){
                    pt.remove(before);
                }
            }
            tp.put(timestamp,price);
            pt.putIfAbsent(price,new HashSet<>());
            pt.get(price).add(timestamp);

            // update last
            if(timestamp >= lastTs){
                lastTs = timestamp;
                lastPrice = price;
            }
        }

        public int current() {
            return lastPrice;
        }

        public int maximum() {
            return pt.lastKey();
        }

        public int minimum() {
            return pt.firstKey();
        }
    }
}
