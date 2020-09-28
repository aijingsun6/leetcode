package org.alking.p700;

public class P707 {

    public static class SinglyListNode {
        int val;
        SinglyListNode next;

        SinglyListNode(int x) {
            val = x;
        }
    }

    private SinglyListNode head = null;

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {

        if (head == null) {
            return -1;
        }
        SinglyListNode n = head;
        for (int i = 0; i < index; i++) {
            if (n == null) {
                return -1;
            }
            n = n.next;
        }
        if(n == null){
            return -1;
        }
        return n.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {

        SinglyListNode n = new SinglyListNode(val);
        n.next = head;
        head = n;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

        SinglyListNode n = head;
        if (n == null) {
            head = new SinglyListNode(val);
        } else {
            while (n.next != null) {
                n = n.next;
            }
            n.next = new SinglyListNode(val);
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {

        if (head == null) {
            head = new SinglyListNode(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        SinglyListNode n = head;
        for (int i = 0; i < index - 1; i++) {
            if (n.next == null) {
                break;
            }
            n = n.next;
        }
        SinglyListNode m = new SinglyListNode(val);
        m.next = n.next;
        n.next = m;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {

        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }
        SinglyListNode n = head;
        for (int i = 0; i < index - 1; i++) {
            if (n.next == null) {
                break;
            }
            n = n.next;
        }
        if (n.next == null) {
            return;
        }
        n.next = n.next.next;
    }
}
