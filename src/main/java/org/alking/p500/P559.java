package org.alking.p500;

import java.util.List;

public class P559 {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;
        if (root.children != null && !root.children.isEmpty()) {
            for (Node n : root.children) {
                max = Math.max(max, maxDepth(n));
            }
        }
        return 1 + max;
    }
}
