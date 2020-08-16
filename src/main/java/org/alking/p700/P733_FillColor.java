package org.alking.p700;

import java.util.*;

public class P733_FillColor {

    public static class Node {

        public int x;

        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node position = (Node) o;
            return x == position.x &&
                    y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (sr < 0 || sr >= image.length) {
            return image;
        }
        if(sc < 0 || sc >= image[sr].length){
            return image;
        }

        LinkedList<Node> queue = new LinkedList<>();
        Set<Node> used = new HashSet<>();
        int oldColor = image[sr][sc];
        Node root = new Node(sr, sc);
        queue.add(root);
        used.add(root);
        image[sr][sc] = newColor;

        while (!queue.isEmpty()) {
            Node n = queue.getFirst();
            int x = n.x;
            int y = n.y;
            walk(queue, used, image, x + 1, y, oldColor, newColor);
            walk(queue, used, image, x - 1, y, oldColor, newColor);
            walk(queue, used, image, x, y + 1, oldColor, newColor);
            walk(queue, used, image, x, y - 1, oldColor, newColor);
            queue.removeFirst();
        }
        return image;
    }

    private void walk(LinkedList<Node> queue, Set<Node> used, int[][] image, int x, int y, int oldColor, int newColor) {

        if (x < 0 || x >= image.length) {
            return;
        }
        int[] line = image[x];
        if (y < 0 || y >= line.length) {
            return;
        }
        Node n = new Node(x, y);
        if (used.contains(n)) {
            return;
        }
        if (line[y] == oldColor) {
            line[y] = newColor;
            queue.add(n);
            used.add(n);
        }

    }
}
