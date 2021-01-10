package org.alking.p800;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class P817 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

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
