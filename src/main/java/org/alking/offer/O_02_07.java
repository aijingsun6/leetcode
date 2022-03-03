package org.alking.offer;

import org.alking.common.ListNode;

public class O_02_07 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int cntA = count(headA);
        int cntB = count(headB);
        if(cntA < cntB){
            for(int i = 0; i < (cntB - cntA );i++){
                headB = headB.next;
            }
        }else if(cntA> cntB){
            for(int i = 0; i < (cntA - cntB );i++){
                headA = headA.next;
            }
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int count(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum += 1;
            head = head.next;
        }
        return sum;
    }
}
