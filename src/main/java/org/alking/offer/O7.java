package org.alking.offer;

import org.alking.common.TreeNode;

import java.util.HashMap;

public class O7 {

    private int[] preorder;
    private int[] inorder;
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int preIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.preorder = preorder;
        this.inorder = inorder;
        map.clear();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(0, inorder.length - 1);

    }

    private TreeNode buildTree(int start, int end) {
        if (start > end) {
            return null;
        }
        int v = preorder[preIdx];
        preIdx++;
        int index = map.get(v);
        TreeNode node = new TreeNode(v);
        node.left = buildTree(start, index - 1);
        node.right = buildTree(index + 1, end);
        return node;
    }
}
