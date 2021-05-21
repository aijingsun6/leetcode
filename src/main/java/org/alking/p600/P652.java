package org.alking.p600;

import org.alking.common.TreeNode;

import java.util.*;

public class P652 {

    HashMap<String, TreeNode> map = new HashMap<>();
    HashSet<String> acc = new HashSet<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        map.clear();
        acc.clear();

        serial(root);

        ArrayList<TreeNode> result = new ArrayList<>();
        for(String s : acc){
            result.add(map.get(s));
        }
        return result;
    }

    private String serial(TreeNode root) {
        if (root == null) {
            return "null";
        }
        String left = serial(root.left);
        String right = serial(root.right);
        String s = String.format("(%s,%d,%s)", left, root.val, right);
        if (map.containsKey(s)) {
            acc.add(s);
        } else {
            map.put(s, root);
        }
        return s;
    }

}
