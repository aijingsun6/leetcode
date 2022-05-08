package org.alking.p1900;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class P1984 {

    public int minimumDifference(int[] nums, int k) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int v : nums) {
            m.put(v, m.getOrDefault(v, 0) + 1);
        }
        int size = m.size();
        int[][] cnt = new int[size][2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            cnt[idx++] = new int[]{e.getKey(), e.getValue()};
            if (e.getValue() >= k) {
                return 0;
            }
        }
        int leftPtr = 0;
        int rightPtr = 0;
        int sum = cnt[leftPtr][1];
        int result = Integer.MAX_VALUE;
        while (leftPtr < size) {
            while (sum < k && (rightPtr < (size - 1))) {
                sum += cnt[++rightPtr][1];
            }
            if (sum >= k) {
                result = Math.min(result, cnt[rightPtr][0] - cnt[leftPtr][0]);
            }
            sum -= cnt[leftPtr][1];
            leftPtr++;

        }
        return result;
    }

    public int minimumDifference2(int[] nums, int k) {
        if (k < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < (nums.length - k + 1); i++) {
            result = Math.min(result, nums[i + k - 1] - nums[i]);
        }
        return result;
    }

    public int minimumDifference3(int[] nums, int k) {
        int SIZE = 100001;
        int[] bucket = new int[SIZE];
        int[] full = new int[SIZE];
        int size = 0;
        for (int v : nums) {
            if (++bucket[v] == 1) {
                full[size++] = v;
            }
            if (bucket[v] >= k) {
                return 0;
            }
        }
        int[] keys = new int[size];
        System.arraycopy(full, 0, keys, 0, size);
        Arrays.sort(keys);
        int leftPtr = 0;
        int rightPtr = 0;
        int sum = bucket[keys[0]];
        int result = Integer.MAX_VALUE;
        while (leftPtr < size) {
            while (sum < k && (rightPtr < (size - 1))) {
                sum += bucket[keys[++rightPtr]];
            }
            if (sum >= k) {
                result = Math.min(result, keys[rightPtr] - keys[leftPtr]);
            }
            sum -= bucket[keys[leftPtr++]];
        }
        return result;

    }

}
