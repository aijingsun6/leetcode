package org.alking.p400;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class P429 {

    class Node {
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


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> acc = new ArrayList<>();
        if (root == null) {
            return acc;
        }
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                Node p = queue.removeFirst();
                list.add(p.val);
                for (Node n : p.children) {
                    queue.addLast(n);
                }
            }
            acc.add(list);

        }
        return acc;
    }
}
