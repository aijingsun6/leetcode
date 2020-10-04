package org.alking.p100;

import java.util.HashMap;

public class P138 {

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
        return copyRandomList(head,new HashMap<>());

    }

    private Node copyRandomList(Node head,HashMap<Node,Node> visit){
        if(visit.containsKey(head)){
            return visit.get(head);
        }
        Node n = new Node(head.val);
        visit.put(head,n);
        if(head.next != null){
            n.next = copyRandomList(head.next, visit);
        }
        if(head.random != null){
            n.random = copyRandomList(head.random, visit);
        }
        return n;
    }
}
