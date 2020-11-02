package org.alking.p200;

import java.util.ArrayList;
import java.util.List;

public class P228 {

    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> acc = new ArrayList<>();
        int start = -1;
        int last = start;
        boolean hasStart = false;
        for(int v: nums){
            if(!hasStart){
                hasStart = true;
                start = v;
                last = v;
                continue;
            }
            if(last + 1 == v){
                last = v;
                continue;
            }
            if(last != start){
                acc.add(String.format("%d->%d",start,last));
            }else {
                acc.add(String.valueOf(start));
            }

            start = v;
            last = v;
        }
        if(hasStart){
            if(last != start){
                acc.add(String.format("%d->%d",start,last));
            }else {
                acc.add(String.valueOf(start));
            }
        }
        return acc;
    }
}
