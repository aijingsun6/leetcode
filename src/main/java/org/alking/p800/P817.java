package org.alking.p800;

import org.alking.common.ListNode;

import java.util.HashSet;

public class P817 {

    public int numComponents(ListNode head, int[] G) {

        HashSet<Integer> s= new HashSet<>();
        for(int v: G){
            s.add(v);
        }
        int acc = 0;
        while (head != null){

            if(s.contains(head.val) &&(head.next == null || !s.contains(head.next.val))){
                acc += 1;
            }

            head = head.next;
        }

        return acc;
    }
}
