package org.alking.p0;

import java.util.ArrayList;
import java.util.List;

public class P78 {

    public List<List<Integer>> subsets(int[] nums) {
        result.clear();
        ArrayList<Integer> acc = new ArrayList<>();
        backtrace(nums, 0, acc);
        return result;
    }

    private List<List<Integer>> result = new ArrayList<>();

    private void backtrace(int[] nums, int from, ArrayList<Integer> acc) {
        if (from == nums.length) {
            result.add(new ArrayList<>(acc));
            return;
        }
        backtrace(nums, from + 1, acc);
        acc.add(nums[from]);
        backtrace(nums, from + 1, acc);
        acc.remove(acc.size() - 1);
    }

}
