package org.alking.p100;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> acc = new ArrayList<>();
        dfs(root,acc);
        return acc;

    }

    private void dfs(TreeNode root, List<Integer> acc) {
        if (root == null) {
            return;
        }
        acc.add(root.val);
        dfs(root.left, acc);
        dfs(root.right, acc);
    }
}
