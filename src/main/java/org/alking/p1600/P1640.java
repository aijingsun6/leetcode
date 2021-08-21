package org.alking.p1600;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class P1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < pieces.length;i++){
            map.put(pieces[i][0],i);
        }
        int offset = 0;
        while (offset < arr.length) {
            int first = arr[offset];
            if(!map.containsKey(first)){
                return false;
            }
            int[] p = pieces[map.get(first)];
            boolean match = true;
            for (int i = 0; i < p.length; i++) {
                if (arr[offset + i] != p[i]) {
                    match = false;
                    break;
                }
            }
            if(!match){
                return false;
            }
            offset += p.length;

        }
        return true;
    }
}
