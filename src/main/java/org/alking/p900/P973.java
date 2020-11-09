package org.alking.p900;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P973 {

    public static class Point {

        public int x;
        public int y;
        public int dist;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }

    }


    public int[][] kClosest(int[][] points, int K) {

        PriorityQueue<Point> queue = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o2.dist - o1.dist;
            }
        });

        for (int[] p : points) {
            queue.add(new Point(p[0], p[1]));
            if (queue.size() > K) {
                queue.remove();
            }
        }
        int[][] res = new int[queue.size()][2];
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Point p = queue.poll();
            res[i] = new int[]{p.x, p.y};
        }

        return res;

    }

}
