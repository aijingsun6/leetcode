package org.alking.p200;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P295 {


    static class MedianFinder {

        private int count = 0;

        private final PriorityQueue<Integer> left = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        private final PriorityQueue<Integer> right = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });


        public MedianFinder() {

        }

        public void addNum(int num) {

            left.offer(num);
            while (!right.isEmpty() && !left.isEmpty() && left.peek() > right.peek()) {
                right.offer(left.poll());
            }

            while (left.size() > (right.size() + 1)) {
                right.offer(left.poll());
            }

            while (right.size() > (left.size() + 1)) {
                left.offer(right.poll());
            }
            count++;

        }

        public double findMedian() {

            if (count % 2 == 0) {
                return ((double) (left.peek() + right.peek())) / 2;
            }
            if (left.size() > right.size()) {
                return left.peek();
            } else {
                return right.peek();
            }
        }
    }

}
