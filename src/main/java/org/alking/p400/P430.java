package org.alking.p400;


public class P430 {

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }
        dfs(head);
        return myHead;
    }

    private Node cur;

    private Node myHead;

    private void dfs(Node head){

        if(cur == null){
            Node n = new Node();
            n.val = head.val;
            cur  = n;
            myHead = n;
        }else {
            Node n = new Node();
            n.val = head.val;
            cur.next = n;
            n.prev = cur;
            cur = n;
        }

        if(head.child != null){
            dfs(head.child);
        }

        if(head.next != null){
            dfs(head.next);
        }

    }

    public void display(Node n){

        if(n != null){
            while (n != null){
                n = n.next;
            }
        }
    }


}
