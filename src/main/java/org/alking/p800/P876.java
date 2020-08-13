package org.alking.p800;

/**
 * <a href="https://leetcode-cn.com/problems/middle-of-the-linked-list/">876. 链表的中间结点</a>
 */
public class P876 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

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
