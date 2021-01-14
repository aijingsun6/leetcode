package org.alking.p100;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P110Test {

    @Test
    public void test(){

        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        P110 p110 = new P110();
        Assert.assertTrue(p110.isBalanced(n1));
    }
}
