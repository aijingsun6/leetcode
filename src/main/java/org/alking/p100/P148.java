package org.alking.p100;

public class P148 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode[] soft = sort(head);
        return soft[0];
    }

    private ListNode[] sort(ListNode head) {
        // head != null
        if (head.next == null) {
            // 1 node
            return new ListNode[]{head, head};
        }
        if(head.next.next == null){
            // 2 nodes
            ListNode[] result = new ListNode[2];
            if(head.val > head.next.val){
                result[0] = head.next;
                result[1] = head;
                result[0].next = result[1];
                result[1].next = null;
            }else {
                result[0] = head;
                result[1] = head.next;
            }
            return result;
        }

        ListNode ltHead = null;
        ListNode ltTail = null;

        ListNode eqHead = null;
        ListNode eqTail = null;


        ListNode gtHead = null;
        ListNode gtTail = null;

        int eqValue = head.val;

        while (head != null) {
            if (head.val < eqValue) {
                if(ltHead == null){
                    ltHead = head;
                }else {
                    ltTail.next = head;
                }
                ltTail = head;
            } else if (head.val > eqValue) {
               if(gtHead == null){
                   gtHead = head;
               }else {
                   gtTail.next = head;
               }
                gtTail = head;

            } else {
                if(eqHead == null){
                    eqHead = head;
                }else {
                    eqTail.next = head;
                }
                eqTail = head;
            }
            head = head.next;
        }

        head = eqHead;
        ListNode tail = eqTail;

        if(ltHead != null){
            ltTail.next = null;
            ListNode[] left = sort(ltHead);
            head = left[0];
            left[1].next = eqHead;
        }

        if(gtHead != null){
            gtTail.next = null;
            ListNode[] right = sort(gtHead);
            tail.next = right[0];
            tail = right[1];
        }
        tail.next = null;
        return new ListNode[]{head, tail};
    }
}
