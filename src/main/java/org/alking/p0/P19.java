package org.alking.p0;

import org.alking.common.ListNode;

public class P19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        // walk n step
        for(int i  = 0; i < n; i ++){
            fast = fast.next;
        }
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        if(slow.next != null){
            slow.next = slow.next.next;
        }

        return head;
    }
}
