package org.alking.p100;

import java.util.ArrayDeque;
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
        Node head = root;
        while (head != null) {

            Node tail = null;
            Node h = null;
            while (head != null) {

                if (head.left != null) {
                    if(h == null){
                        h = head.left;
                    }
                    if (tail != null) {
                        tail.next = head.left;
                    }
                    tail = head.left;

                }
                if (head.right != null) {
                    if(h == null){
                        h = head.right;
                    }
                    if (tail != null) {
                        tail.next = head.right;
                    }
                    tail = head.right;
                }

                head = head.next;
            }
            head = h;
        }
        return root;
    }
}
