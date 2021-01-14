package org.alking.p800;

import org.alking.common.TreeNode;

import java.util.ArrayList;

public class P872 {


    private void parse(TreeNode root, ArrayList<Integer> acc) {

        if (root.left == null && root.right == null) {
            acc.add(root.val);
            return;
        }
        if (root.left != null) {
            parse(root.left, acc);
        }
        if (root.right != null) {
            parse(root.right, acc);
        }

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> acc1 = new ArrayList<>();
        parse(root1, acc1);

        ArrayList<Integer> acc2 = new ArrayList<>();
        parse(root2, acc2);
        if (acc1.size() != acc2.size()) {
            return false;
        }
        for (int i = 0; i < acc1.size(); i++) {
            if (!acc1.get(i).equals(acc2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
