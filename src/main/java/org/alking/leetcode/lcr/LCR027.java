package org.alking.leetcode.lcr;

import org.alking.leetcode.common.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LCR027 {

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> q = new ArrayDeque<>();
        while (head != null) {
            q.addLast(head.val);
            head = head.next;
        }
        while (!q.isEmpty()) {
            if (!q.peekFirst().equals(q.peekLast())) {
                return false;
            }
            q.removeFirst();
            if (!q.isEmpty()) {
                q.removeLast();
            }
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        ListNode origin = head;
        int size = 0;
        while (head != null){
            size += 1;
            head = head.next;
        }
        Stack<Integer> stack = new Stack<>();
        head = origin;
        for(int i = 0; i < size/2; i++){
            stack.push( head.val);
            head = head.next;
        }
        if( (size % 2) > 0){
            head = head.next;
        }
        while ( head != null){
            if (head.val != stack.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }

}
