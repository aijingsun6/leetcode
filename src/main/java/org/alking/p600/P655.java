package org.alking.p600;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P655 {

    public List<List<String>> printTree(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }
        int depth = depth(root);
        int width = (int) Math.pow(2, depth) - 1;
        String[][] mat = new String[depth][width];
        for (int i = 0; i < depth; i++) {
            Arrays.fill(mat[i], "");
        }
        fill(root, mat, 0, 0, width);
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < depth; i++) {
            result.add(Arrays.asList(mat[i]));
        }
        return result;
    }

    private void fill(final TreeNode root, final String[][] mat, int row, int l, int r) {

        int idx = (l + r) / 2;
        mat[row][idx] = "" + root.val;
        if (root.left != null) {
            fill(root.left, mat, row + 1, l, idx);
        }
        if (root.right != null) {
            fill(root.right, mat, row + 1, idx, r);
        }
    }

    private int depth(TreeNode root) {
        int depthL = root.left != null ? depth(root.left) : 0;
        int depthR = root.right != null ? depth(root.right) : 0;
        return 1 + Math.max(depthL, depthR);
    }

}
