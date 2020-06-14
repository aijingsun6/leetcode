package org.alking.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PSKTri {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> acc = new LinkedList<>();
        if (numRows < 1) {
            return acc;
        }
        acc.add(Arrays.asList(1));
        if(numRows < 2){
            return acc;
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev  = acc.get(i - 1);
            int size = prev.size();
            List<Integer> add = new ArrayList<>(size + 1);
            add.add(1);//idx = 0
            for( int j = 1; j < size;j++){
                add.add(prev.get(j-1)+ prev.get(j));
            }
            add.add(1);
            acc.add(add);
        }
        return acc;

    }
}
