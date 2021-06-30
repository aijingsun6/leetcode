package org.alking.p200;

import org.alking.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 采用数组压缩的方式，缺点，稀疏的空间利用率低
 */
public class P297 {

    private static final TreeNode NULL = new TreeNode(0);

    private static final String STR_NULL = "null";

    private static final String SEP = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        final ArrayList<String> acc = new ArrayList<>();

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<TreeNode> append = new ArrayList<>();
            boolean next = false;
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.removeFirst();
                if (NULL.equals(n)) {
                    acc.add(STR_NULL);
                    append.add(NULL);
                    append.add(NULL);
                } else {
                    acc.add(String.valueOf(n.val));
                    if (n.left == null) {
                        append.add(NULL);
                    } else {
                        append.add(n.left);
                        next = true;
                    }
                    if (n.right == null) {
                        append.add(NULL);
                    } else {
                        append.add(n.right);
                        next = true;
                    }
                }
            }
            if (next) {
                queue.addAll(append);
            }
        }
        return "[" + String.join(SEP, acc) + "]";

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() < 3){
            return null;
        }
        String s = data.substring(1, data.length() - 1);
        String[] arr = s.replace(" ","").replace("\n","").split(",");
        if(arr.length < 1){
            return null;
        }
        TreeNode[] nodes = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (STR_NULL.equals(arr[i])) {
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(Integer.valueOf(arr[i]));
            }
        }
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            if (nodes[i] != null) {
                int left = i * 2 + 1;
                if(left < arr.length){
                    nodes[i].left = nodes[left];
                }
                int right = i * 2 + 2;
                if(right < arr.length){
                    nodes[i].right = nodes[right];
                }
            }
        }
        return nodes[0];
    }
}
