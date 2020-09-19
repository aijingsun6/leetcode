package org.alking.p1500;

import java.util.ArrayList;
import java.util.List;

public class P1560 {


    public List<Integer> mostVisited(int n, int[] rounds) {

        int len = rounds.length;
        int start = rounds[0];
        int end = rounds[len-1];

        List<Integer> result = new ArrayList<>();
        if(start <= end){

            for(int i = start; i <= end; i++){
                result.add(i);
            }
        }else {
            for(int i = 1; i <= end;i++){
                result.add(i);
            }
            for(int i = start;i <= n ; i++){
                result.add(i);
            }
        }
        return result;
    }
}
