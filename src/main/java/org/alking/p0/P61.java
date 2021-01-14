package org.alking.p0;

import org.alking.common.ListNode;

public class P61 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(k < 1){
            return head;
        }

        // find last
        ListNode last = head;
        int count = 1;
        while (last.next != null){
            last = last.next;
            count += 1;
        }

        int mod = k % count;
        if(mod == 0){
            return head;
        }
        mod = count - mod;
        // make cycle
        last.next = head;
        for(int i = 0; i < mod-1; i++){
            head = head.next;
        }
        ListNode result = head.next;
        head.next = null;
        return result;
    }
}
