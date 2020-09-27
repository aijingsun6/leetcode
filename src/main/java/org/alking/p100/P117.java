package org.alking.p100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class P117 {

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {

        if (root == null) {
            return root;
        }

        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        List<Node> nodes = new ArrayList<>();
        while (!queue.isEmpty()){

            nodes.clear();

            while (!queue.isEmpty()){
                Node node = queue.poll();
                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
                node.next = queue.peek();
            }
            queue.addAll(nodes);
            nodes.clear();
        }

        return root;

    }
}
