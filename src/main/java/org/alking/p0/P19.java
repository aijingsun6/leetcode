package org.alking.p0;

public class P19 {
    
      public static  class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }

          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }

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
