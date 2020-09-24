package org.alking.p500;

import java.util.ArrayList;
import java.util.List;

public class P501 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }


    public int[] findMode(TreeNode root) {

        if (root == null) {
            return new int[0];
        }
        last = root.val;
        dfs(root);

        int[] result = new int[values.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = values.get(i);
        }
        return result;
    }

    /**
     * 使用中序遍历，但前置值 >= 最后的值
     */
    private void dfs(TreeNode root) {

        if (root.left != null) {
            dfs(root.left);
        }

        updateAcc(root.val);

        if (root.right != null) {
            dfs(root.right);
        }

    }

    private ArrayList<Integer> values = new ArrayList<>();
    private int maxCnt = 0;
    private int last;
    private int lastCnt = 0;

    private void updateAcc(int v) {
        System.out.println(v);
        if (v == last) {
            lastCnt += 1;
        } else {
            last = v;
            lastCnt = 1;
        }
        if (lastCnt > maxCnt) {
            values = new ArrayList<>();
            values.add(v);
            maxCnt = lastCnt;
        } else if (lastCnt == maxCnt) {
            values.add(v);
        }
    }

}
