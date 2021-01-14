package org.alking.p0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates == null || candidates.length == 0) {
            return Collections.emptyList();
        }
        Arrays.sort(candidates);
        return combinationSum2(candidates, target, 0);
    }

    private List<List<Integer>> combinationSum2(int[] candidates, int target, int from) {

        if (target < 0) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        if (target == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        for(int idx = from; idx < candidates.length;idx++){
            int v = candidates[idx];
            List<List<Integer>> once = combinationSum2(candidates, target - candidates[idx], idx);
            if (once != null && !once.isEmpty()) {
                for (List<Integer> e : once) {
                    e.add(v);
                    result.add(e);
                }
            }
        }
        return result;
    }

}
