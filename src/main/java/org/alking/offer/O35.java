package org.alking.offer;

import java.util.IdentityHashMap;

public class O35 {
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        IdentityHashMap<Node, Node> acc = new IdentityHashMap<>();
        return copyRandomList(head, acc);

    }

    private Node copyRandomList(Node head, IdentityHashMap<Node, Node> acc) {
        if (acc.containsKey(head)) {
            return acc.get(head);
        }
        Node n = new Node(head.val);
        acc.put(head, n);
        if (head.next != null) {
            n.next = copyRandomList(head.next, acc);
        }
        if (head.random != null) {
            n.random = copyRandomList(head.random, acc);
        }
        return n;
    }


}
