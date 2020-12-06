package org.alking.p100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P118 {

    private static final int CACHE_SIZE = 32;

    private static int CACHE_IDX = 0;

    private static HashMap<Integer, List<Integer>> cache = new HashMap<>();

    static {
        cache.put(1, Arrays.asList(1));
        CACHE_IDX = 1;
        findNums(CACHE_SIZE);
    }

    private static List<Integer> findNums(int idx) {
        if (cache.containsKey(idx)) {
            return cache.get(idx);
        }
        for (int i = CACHE_IDX + 1; i <= idx; i++) {
            List<Integer> prev  = cache.get(i-1);
            int size = prev.size();
            List<Integer> add = new ArrayList<>(size + 1);
            add.add(1);//idx = 0
            for( int j = 1; j < size;j++){
                add.add(prev.get(j-1)+ prev.get(j));
            }
            add.add(1);
            cache.put(i,add);
        }
        CACHE_IDX = idx;
        return cache.get(idx);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> acc = new ArrayList<>();
        for(int i = 1; i <= numRows;i++){
            acc.add(findNums(i));
        }
        return acc;
    }

}
