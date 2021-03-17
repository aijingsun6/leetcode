package org.alking.p0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P90 {

    private List<List<Integer>> acc = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        acc.clear();
        acc.add(Collections.emptyList());
        if (nums == null || nums.length == 0) {
            return acc;
        }

        Arrays.sort(nums);
        int idx = 0;
        while (idx < nums.length) {

            int v = nums[idx];
            int c = 1;
            while (true){
                idx = idx + 1;
                if (idx < nums.length && nums[idx] == v) {
                    c++;
                } else {
                    break;
                }
            }
            append(v, c);
        }
        return acc;
    }

    private void append(int num, int count) {
        List<List<Integer>> add = new ArrayList<>();
        for (List<Integer> pre : this.acc) {
            for (int i = 1; i <= count; i++) {
                List<Integer> o = new ArrayList<>(pre);
                o.addAll(Collections.nCopies(i, num));
                add.add(o);
            }
        }
        acc.addAll(add);
    }
}
