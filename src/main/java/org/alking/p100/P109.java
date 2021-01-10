package org.alking.p100;

public class P109 {

    public static class ListNode {
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

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            // only 1 element
            return new TreeNode(head.val);
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while ( fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);

        ListNode r = mid.next;
        mid.next = null;
        root.right = sortedListToBST(r);
        return root;
    }
}
