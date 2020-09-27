package org.alking.p100;

import java.util.ArrayList;

public class P116 {

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

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(root);
        ArrayList<Node> list = new ArrayList<>();
        while (!nodes.isEmpty()) {
            list.addAll(nodes);
            nodes.clear();
            for (int i = 0; i < list.size(); i++) {
                Node n = list.get(i);
                if(i < list.size()-1){
                    n.next = list.get(i + 1);
                }
                if(n.left != null){
                    nodes.add(n.left);
                }
                if(n.right != null){
                    nodes.add(n.right);

                }
            }
            list.clear();
        }

        return root;
    }
}
