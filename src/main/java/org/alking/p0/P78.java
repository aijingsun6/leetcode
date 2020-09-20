package org.alking.p0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P78 {

    public List<List<Integer>> subsets(int[] nums) {


        if (nums == null || nums.length == 0) {
            return Arrays.asList(new ArrayList<>());
        }

        List<List<Integer>> acc = new ArrayList<>();


        for (int v : nums) {

            if (acc.isEmpty()) {
                acc.add(new ArrayList<>());
                ArrayList<Integer> list = new ArrayList<>();
                list.add(v);
                acc.add(list);
                continue;
            }

            List<List<Integer>> add = new ArrayList<>();
            for (List<Integer> list : acc) {
                List<Integer> list2 = new ArrayList<>(list);
                list2.add(v);
                add.add(list2);
            }
            acc.addAll(add);
        }
        return acc;
    }


}
