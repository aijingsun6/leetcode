package org.alking.p0;

import java.util.ArrayList;
import java.util.List;

public class P57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> acc = new ArrayList<>();
        boolean add = false;
        for (int[] range : intervals) {
            if (range[1] < newInterval[0]) {
                acc.add(range);
                continue;
            }
            if (add) {
                acc.add(range);
                continue;
            }
            if (range[0] > newInterval[1]) {
                acc.add(newInterval);
                add = true;
                acc.add(range);
                continue;
            }
            newInterval[0] = Math.min(range[0], newInterval[0]);
            newInterval[1] = Math.max(range[1], newInterval[1]);
        }
        if(!add){
            acc.add(newInterval);
        }
        int[][] res = new int[acc.size()][2];
        for (int i = 0; i < acc.size(); i++) {
            res[i] = acc.get(i);
        }
        return res;
    }
}
