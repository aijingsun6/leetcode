package org.alking.p1100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P1104 {

    public List<Integer> pathInZigZagTree(int label) {
        if(label < 2){
            return Arrays.asList(1);
        }
        ArrayList<Integer> powArray = new ArrayList<>();
        int p = 1;
        while (p <= label) {
            powArray.add(p);
            p = p << 1;
        }

        List<Integer> path = new LinkedList<>();
        int idx = powArray.size() - 1;
        while (label > 0) {
            path.add(0,label);
            int pow = powArray.get(idx);
            label = (pow-1) - (label-pow)/2;
            idx = idx - 1;
        }
        return path;
    }


}
