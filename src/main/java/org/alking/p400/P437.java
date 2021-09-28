package org.alking.p400;

import org.alking.common.TreeNode;

import java.util.HashMap;

public class P437 {

    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        int result = countPath(root,sum);
        int a = pathSum(root.left,sum);
        int b = pathSum(root.right,sum);
        return result+a+b;

    }

    public int countPath(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum - root.val;
        int result = sum == 0 ? 1 : 0;
        return result + countPath(root.left, sum) + countPath(root.right, sum);
    }

    public int pathSum2(TreeNode root, int targetSum) {
        res = 0;
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(0,1);
        dfs(root,targetSum,0,sumMap);
        return res;
    }

    private int res = 0;
    private void dfs(TreeNode root, int targetSum, int sum, HashMap<Integer, Integer> sumMap) {
        if (root == null) {
            return;
        }
        sum += root.val;
        int pre = sum-targetSum;
        res += sumMap.getOrDefault(pre, 0);
        sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        if (root.left != null) {
            dfs(root.left, targetSum, sum,sumMap);
        }
        if (root.right != null ){
            dfs(root.right, targetSum, sum,sumMap);
        }
        sumMap.put(sum, sumMap.getOrDefault(sum, 0) - 1);
    }


}
