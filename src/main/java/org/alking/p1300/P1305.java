package org.alking.p1300;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> acc1 = order(root1);
        ArrayList<Integer> acc2 = order(root2);
        List<Integer> result = new ArrayList<>(acc1.size() + acc2.size());
        int i = 0;
        int j = 0;
        while (i < acc1.size() && j < acc2.size()) {
            if(acc1.get(i) < acc2.get(j)){
                result.add(acc1.get(i));
                i ++;
            }else{
                result.add(acc2.get(j));
                j ++;
            }
        }

        for(; i < acc1.size();i++){
            result.add(acc1.get(i));
        }
        for(;j < acc2.size();j++){
            result.add(acc2.get(j));
        }
        return result;
    }

    private ArrayList<Integer> order(TreeNode root) {
        ArrayList<Integer> acc = new ArrayList<>();
        dfs(root, acc);
        return acc;
    }

    private void dfs(TreeNode root, ArrayList<Integer> acc) {
        if (root == null) {
            return;
        }
        dfs(root.left, acc);
        acc.add(root.val);
        dfs(root.right, acc);
    }
}
