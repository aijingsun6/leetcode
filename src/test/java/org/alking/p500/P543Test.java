package org.alking.p500;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P543Test {

    @Test
    public void test(){

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        P543 p543 = new P543();
        Assert.assertTrue(3 == p543.diameterOfBinaryTree(n1));
    }
}
