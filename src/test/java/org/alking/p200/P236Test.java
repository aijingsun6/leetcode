package org.alking.p200;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P236Test {

    @Test
    public void test(){

        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(0);
        TreeNode n7 = new TreeNode(8);
        TreeNode n8 = new TreeNode(7);
        TreeNode n9 = new TreeNode(4);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n5.left = n8;
        n5.right = n9;

        TreeNode aes = new P236().lowestCommonAncestor(n1,n2,n3);
        Assert.assertEquals(3,aes.val);

        aes = new P236().lowestCommonAncestor(n1,n2,n9);
        Assert.assertEquals(n2.val,aes.val);
    }
}
