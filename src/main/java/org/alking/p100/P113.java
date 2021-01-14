package org.alking.p100;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (root == null) {
            return Collections.emptyList();
        }

        ArrayList<Integer> acc = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        acc.add(root.val);
        int left = sum - root.val;
        dfs(root, left, acc, result);
        return result;
    }


    private void dfs(TreeNode root, int left, List<Integer> acc, List<List<Integer>> result) {
        if (root.left == null && root.right == null) {
            //left
            if (left == 0) {
                result.add(new ArrayList<>(acc));
            }
            return;
        }
        if (root.left != null) {
            acc.add(root.left.val);
            dfs(root.left, left - root.left.val, acc, result);
            acc.remove(acc.size() - 1);
        }

        if (root.right != null) {
            acc.add(root.right.val);
            dfs(root.right, left - root.right.val, acc, result);
            acc.remove(acc.size() - 1);
        }
    }
}
