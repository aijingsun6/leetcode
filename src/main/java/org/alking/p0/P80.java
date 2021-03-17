package org.alking.p0;

public class P80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int idx = 0;
        int ptr = 0;
        int n = nums.length;
        while (ptr < n) {
            int v = nums[ptr];
            int cnt = 1;
            while ((++ptr) < n && nums[ptr] == v) {
                cnt++;
            }
            nums[idx++] = v;
            if (cnt > 1) {
                nums[idx++] = v;
            }

        }
        return idx;
    }
}
