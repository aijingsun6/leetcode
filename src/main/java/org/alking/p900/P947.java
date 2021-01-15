package org.alking.p900;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class P947 {

    private void putMap(HashMap<Integer, ArrayList<Integer>> map, Integer k, Integer idx) {
        if (map.containsKey(k)) {
            map.get(k).add(idx);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(idx);
            map.put(k, list);
        }
    }

    public int removeStones(int[][] stones) {
        HashMap<Integer, ArrayList<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> colMap = new HashMap<>();
        int[] stone;
        int row = 0;
        int col = 0;
        for (int i = 0; i < stones.length; i++) {
            stone = stones[i];
            row = stone[0];
            col = stone[1];
            putMap(rowMap, row, i);
            putMap(colMap, col, i);
        }

        int acc = 0;
        boolean[] visit = new boolean[stones.length];

        for (int i = 0; i < stones.length; i++) {

            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            acc += 1;
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            while (!queue.isEmpty()){
                int idx = queue.removeFirst();
                stone = stones[idx];
                row = stone[0];
                col = stone[1];
                ArrayList<Integer> rowList = rowMap.getOrDefault(row,new ArrayList<>());
                for(int ri : rowList){
                    if(!visit[ri]){
                        visit[ri] = true;
                        queue.add(ri);
                    }
                }
                ArrayList<Integer> colList = colMap.getOrDefault(col,new ArrayList<>());
                for(int ci : colList){
                    if(!visit[ci]){
                        visit[ci] = true;
                        queue.add(ci);
                    }
                }

            }

        }


        return stones.length - acc;
    }
}
