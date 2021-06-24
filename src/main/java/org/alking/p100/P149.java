package org.alking.p100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class P149 {

    public static class Point {

        public int x;

        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static class Line {

        private final HashSet<Point> points = new HashSet<>();

        private final Point p1;
        private final Point p2;

        public HashSet<Point> getPoints() {
            return points;
        }

        public void addPoint(Point p) {
            this.points.add(p);
        }

        public boolean containsPoint(Point p) {
            return this.points.contains(p);
        }

        public int size() {
            return this.points.size();
        }

        public boolean sameLine(Point p) {
            if (this.points.contains(p)) {
                return true;
            }
            return (p2.x - p1.x) * (p.y - p1.y) == (p.x - p1.x) * (p2.y - p1.y);

        }

        public Line(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
            this.points.add(p1);
            this.points.add(p2);
        }
    }


    public int maxPoints(int[][] input) {
        final int N = input.length;
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(input[i][0], input[i][1]);
        }


        int result = 0;
        final ArrayList<Line> lines = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            Point p1 = points[i];

            for (int j = i + 1; j < N; j++) {

                Point p2 = points[j];

                if (lines.isEmpty()) {
                    Line newline = new Line(p1, p2);
                    lines.add(newline);
                    result = 2;
                } else {
                    boolean addLine = true;
                    for (Line line : lines) {
                        boolean sameP1 = line.sameLine(p1);
                        boolean sameP2 = line.sameLine(p2);
                        if (sameP1) {
                            line.addPoint(p1);
                        }
                        if (sameP2) {
                            line.addPoint(p2);
                        }

                        if(sameP1 || sameP2){
                            result = Math.max(result, line.size());
                        }
                        if (sameP1 && sameP2) {
                            addLine = false;
                        }
                    }
                    if (addLine) {
                        lines.add(new Line(p1, p2));
                    }
                }

            }
        }
        return result;
    }
}
