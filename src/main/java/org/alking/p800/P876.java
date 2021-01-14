package org.alking.p800;

import org.alking.common.ListNode;

/**
 * <a href="https://leetcode-cn.com/problems/middle-of-the-linked-list/">876. 链表的中间结点</a>
 */
public class P876 {

    public ListNode middleNode(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next == null){
            return slow;
        }else {
            return slow.next;
        }

    }
}
