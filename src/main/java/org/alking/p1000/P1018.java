package org.alking.p1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1018 {


    public List<Boolean> prefixesDivBy5(int[] A) {

        if(A == null || A.length == 0){
            return Collections.emptyList();
        }
        ArrayList<Boolean> acc = new ArrayList<>(A.length);


        int sum = 0;
        for(int v: A){
            sum = (sum * 2 + v) % 5;
            acc.add(sum == 0);
        }
        return acc;


    }
}
