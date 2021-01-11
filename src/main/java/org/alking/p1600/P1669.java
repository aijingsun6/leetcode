package org.alking.p1600;

public class P1669 {

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

    private ListNode walk(ListNode head, int n){
        int c = 0;
        while (head != null && c < n){
            head = head.next;
            c ++;
        }
        return head;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = walk(list1,a-1);
        ListNode sec = walk(list1,b);
        ListNode tail = list2;
        while (tail.next != null){
            tail = tail.next;
        }
        first.next = list2;
        tail.next = sec.next;
        return list1;
    }
}
