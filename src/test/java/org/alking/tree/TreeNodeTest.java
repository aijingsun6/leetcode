package org.alking.tree;

import org.junit.Assert;
import org.junit.Test;

public class TreeNodeTest {

    TreeNode n = new TreeNode(0);

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
        Assert.assertFalse(n.isValidBST(n3));

    }


    @Test
    public void levelOrderTest(){


    }


    @Test
    public void sortedArrayToBSTTest(){
        int[] arr = {1,2,3};
        TreeNode root = n.sortedArrayToBST(arr);
        Assert.assertEquals(2,root.val);
        Assert.assertEquals(1,root.left.val);
        Assert.assertEquals(3,root.right.val);

        arr = new int[]{1,2,3,4,5};
        root = n.sortedArrayToBST(arr);
        Assert.assertEquals(3,root.val);
        Assert.assertEquals(1,root.left.val);
        Assert.assertEquals(2,root.left.right.val);

        Assert.assertEquals(4,root.right.val);
        Assert.assertEquals(5,root.right.right.val);

    }
}
