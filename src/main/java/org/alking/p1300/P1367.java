package org.alking.p1300;

import org.alking.common.ListNode;
import org.alking.common.TreeNode;

public class P1367 {

    private boolean dfs(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(head.val != root.val){
            return false;
        }
        return dfs(head.next,root.left) || dfs(head.next,root.right);

    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val == root.val) {
            boolean ret = dfs(head,root);
            if (ret) {
                return true;
            }
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
