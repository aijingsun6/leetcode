package org.alking.offer;

import org.alking.common.ListNode;

/**
 * https://leetcode-cn.com/problems/sum-lists-lcci/
 */
public class O_02_05 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null){

            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum > 9 ? 1:0;
            sum = sum % 10;
            ListNode n = new ListNode(sum);
            tail.next = n;
            tail = n;
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
