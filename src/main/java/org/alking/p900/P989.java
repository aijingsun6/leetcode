package org.alking.p900;

import java.util.ArrayList;
import java.util.List;

public class P989 {

    public List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> kList = new ArrayList<>();
        while (K > 0){
            kList.add(0, K % 10);
            K = K /10;
        }

        int aIdx = A.length - 1;
        int kIdx = kList.size() - 1;

        List<Integer> acc = new ArrayList<>();
        boolean add = false;
        while (aIdx >= 0 && kIdx >= 0){


            int v = A[aIdx] + kList.get(kIdx);
            if(add){
                v = v + 1;
            }

            if(v >= 10){
                acc.add(0, v %10);
                add = true;
            }else {
                acc.add(0,v);
                add = false;
            }
            aIdx -= 1;
            kIdx -= 1;

        }
        while (aIdx >= 0){
            int v = A[aIdx];
            if(add){
                v = v + 1;
            }
            if(v >= 10){
                acc.add(0, v %10);
                add = true;
            }else {
                acc.add(0,v);
                add = false;
            }
            aIdx -=1;
        }

        while(kIdx >= 0){
            int v = kList.get(kIdx);
            if(add){
                v = v + 1;
            }
            if(v >= 10){
                acc.add(0, v %10);
                add = true;
            }else {
                acc.add(0,v);
                add = false;
            }
            kIdx -= 1;
        }
        if(add){
            acc.add(0,1);
        }
        return acc;
    }
}
