package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/three-in-one-lcci/
 */
public class M0301 {

    public static class TripleInOne {

        private int[] array;
        private int size;
        private int[] start;
        private int[] ptr;
        private int[] cap;

        public TripleInOne(int stackSize) {
            this.array = new int[stackSize * 3];
            this.size = stackSize;
            this.start = new int[]{0, size, size * 2};
            this.ptr = new int[]{0, size, size * 2};
            this.cap = new int[]{size, size * 2, size * 3};

        }

        public void push(int stackNum, int value) {
            if (ptr[stackNum] < cap[stackNum]) {
                array[ptr[stackNum]] = value;
                ptr[stackNum]++;
            }
        }

        public int pop(int stackNum) {
            if (ptr[stackNum] > start[stackNum]) {
                return array[--ptr[stackNum]];
            }
            return -1;
        }

        public int peek(int stackNum) {
            if (ptr[stackNum] > start[stackNum]) {
                return array[ptr[stackNum]-1];
            }
            return -1;
        }

        public boolean isEmpty(int stackNum) {
            return ptr[stackNum] == start[stackNum];
        }
    }
}
