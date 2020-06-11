package org.alking.tree;

import org.junit.Assert;
import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void isValidBSTTest(){
        TreeNode n3 = new TreeNode(3);
        TreeNode n30 = new TreeNode(30);
        TreeNode n10 = new TreeNode(10);
        TreeNode n15 = new TreeNode(15);
        TreeNode n45 = new TreeNode(45);
        n3.right = n30;
        n30.left = n10;
        n10.right = n15;
        n15.right = n45;
        TreeNode n0 = new TreeNode(0);
        Assert.assertFalse(n0.isValidBST(n3));

    }
}
