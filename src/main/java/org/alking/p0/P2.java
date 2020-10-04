package org.alking.p0;

public class P2 {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = null;
        ListNode cur = null;
        while (carry > 0 || l1 != null || l2 != null){


            int v = carry;
            if(l1 != null){
                v += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                v += l2.val;
                l2 = l2.next;
            }

            carry = v / 10;
            v = v % 10;
            ListNode n  = new ListNode(v);

            if(head == null){
                head = n;
            }
            if(cur == null){
                cur = n;
            }else {
                cur.next = n;
                cur = n;
            }

        }
        return head;

    }

}
