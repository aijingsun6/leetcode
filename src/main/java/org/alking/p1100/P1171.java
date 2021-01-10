package org.alking.p1100;

import java.util.HashMap;

public class P1171 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        while (true){
            // sum -> [pre,node]
            HashMap<Integer,ListNode> sumMap = new HashMap<>();
            ListNode h = head;
            int sum = 0;
            while (h != null){
                sum += h.val;
                if(sum == 0){
                    head = h.next;
                    break;
                }
                if(sumMap.containsKey(sum)){
                    ListNode pn = sumMap.get(sum);
                    pn.next = h.next;
                    break;
                }
                sumMap.put(sum,h);
                h = h.next;
            }
            if(h == null){
                break;
            }
        }
        return head;
    }
}
