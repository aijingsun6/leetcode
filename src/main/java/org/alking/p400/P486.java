package org.alking.p400;

public class P486 {

    public static class TakeOpe {

        public boolean left;

        public int acc;

        public boolean isLeft() {
            return left;
        }

        public void setLeft(boolean left) {
            this.left = left;
        }

        public int getAcc() {
            return acc;
        }

        public void setAcc(int acc) {
            this.acc = acc;
        }

        public TakeOpe(boolean left, int acc) {
            this.left = left;
            this.acc = acc;
        }
    }


    public boolean PredictTheWinner(int[] nums) {
        TakeOpe[][] cache = new TakeOpe[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            cache[i] = new TakeOpe[nums.length];
        }
        int sum = 0;
        for (int v : nums) {
            sum += v;
        }
        TakeOpe take = takeMax(nums, 0, nums.length - 1, cache);
        return (take.acc * 2) >= sum;
    }

    private TakeOpe takeMax(int[] nums, int left, int right, TakeOpe[][] cache) {

        if (cache[left][right] != null) {
            return cache[left][right];
        }

        TakeOpe ret;
        // 1 element
        if (left == right) {
            ret = new TakeOpe(true, nums[left]);
            cache[left][right] = ret;
            return ret;
        }

        // 2 element
        if (left + 1 == right) {
            if (nums[left] > nums[right]) {
                ret = new TakeOpe(true, nums[left]);
            } else {
                ret = new TakeOpe(false, nums[right]);
            }
            cache[left][right] = ret;
            return ret;
        }

        // > 2 element
        // take left
        TakeOpe takeLeft = takeLeft(nums, left, right, cache);
        TakeOpe takeRight = takeRight(nums, left, right, cache);
        if (takeLeft.acc > takeRight.acc) {
            ret = takeLeft;
        } else {
            ret = takeRight;
        }
        cache[left][right] = ret;
        return ret;
    }

    // take from left
    private TakeOpe takeLeft(int[] nums, int left, int right, TakeOpe[][] cache) {
        int acc = nums[left];
        TakeOpe take = takeMax(nums, left + 1, right, cache);
        if (take.left) {
            acc += takeMax(nums, left + 2, right, cache).acc;
        } else {
            acc += takeMax(nums, left + 1, right - 1, cache).acc;
        }
        return new TakeOpe(true, acc);
    }

    private TakeOpe takeRight(int[] nums, int left, int right, TakeOpe[][] cache) {
        int acc = nums[right];
        TakeOpe take = takeMax(nums, left, right - 1, cache);
        if (take.left) {
            acc += takeMax(nums, left + 1, right - 1, cache).acc;
        } else {
            acc += takeMax(nums, left, right - 2, cache).acc;
        }
        return new TakeOpe(false, acc);
    }

}
