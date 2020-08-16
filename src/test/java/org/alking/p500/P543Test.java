package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P543Test {

    @Test
    public void test(){

        P543.TreeNode n1 = new P543.TreeNode(1);
        P543.TreeNode n2 = new P543.TreeNode(2);
        P543.TreeNode n3 = new P543.TreeNode(3);
        P543.TreeNode n4 = new P543.TreeNode(4);
        P543.TreeNode n5 = new P543.TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        P543 p543 = new P543();
        Assert.assertTrue(3 == p543.diameterOfBinaryTree(n1));
    }
}
