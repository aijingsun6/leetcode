package org.alking.p400;

import java.util.ArrayList;
import java.util.List;

public class P448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int idx = 0; idx < nums.length; idx++) {
            int v = nums[idx];
            int tmp;
            while (v > 0) {
                tmp = nums[v - 1];
                nums[v - 1] = -1;
                v = tmp;
            }

        }
        List<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] > 0) {
                result.add(idx + 1);
            }
        }
        return result;
    }
}
