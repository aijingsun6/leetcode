package org.alking.p0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P18 {


    public List<List<Integer>> fourSum(int[] nums, int target) {

        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }

        List<List<Integer>> acc = new ArrayList<>();

        Arrays.sort(nums);
        int size = nums.length;
        // 0 ..    n-3, n-2,  n-1
        for (int i = 0; i < size - 3; i++) {

            for (int j = i + 1; j < size - 2; j++) {



                int v = nums[i] + nums[j];

                int left = j + 1;
                int right = size - 1;

                while (left < right) {

                    if (left > (j +1) && nums[left] == nums[left - 1]) {
                        left += 1;
                        continue;
                    }

                    if (right < (size - 1) && nums[right] == nums[right + 1]) {
                        right -= 1;
                        continue;
                    }

                    int sum = v + nums[left] + nums[right];
                    if (sum == target) {
                        acc.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left = left + 1;
                        right = right - 1;
                    } else if (sum > target) {
                        right = right - 1;
                    } else {
                        left = left + 1;
                    }

                }

            }
        }
        return acc;
    }
}
