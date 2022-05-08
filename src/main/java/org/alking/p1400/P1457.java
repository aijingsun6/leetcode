package org.alking.p1400;

import org.alking.common.TreeNode;

public class P1457 {

    int result = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        if (root == null) {
            return 0;
        }
        result = 0;

        dfs(root, 0);
        return result;
    }


    private void dfs(TreeNode root, int acc) {

        acc ^= (1 << root.val);
        if(root.left == null && root.right == null){

            // is leaf
            if(acc == 0 || (acc & (acc-1)) == 0){
                result ++;
            }
        }
        if(root.left != null){
            dfs(root.left,acc);
        }
        if(root.right != null){
            dfs(root.right,acc);
        }

    }

}
