package org.alking.p1300;

public class P1352 {

    public static class ProductOfNumbers {
        private int[] array = new int[40000];
        private int size = 0;

        public ProductOfNumbers() {

        }

        public void add(int num) {
            array[size++] = num;
        }

        public int getProduct(int k) {
            int start = size;
            int cnt = 0;
            int acc = 1;
            while (cnt < k) {
                acc *= array[--start];
                cnt++;
                if (acc == 0) {
                    return 0;
                }
            }
            return acc;
        }
    }

    public static class ProductOfNumbers2 {
        private int[] pre = new int[40001];
        private int len;

        public ProductOfNumbers2() {
            pre[0] = 1;
        }

        public void add(int num) {
            if (num == 0) {
                len = 0;
            } else {
                pre[++len] = num;
                pre[len] *= pre[len - 1];
            }
        }

        public int getProduct(int k) {
            if (k > len) {
                return 0;
            }
            return pre[len] / pre[len - k];
        }
    }

}
