package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P236Test {

    @Test
    public void test(){

        P236.TreeNode n1 = new P236.TreeNode(3);
        P236.TreeNode n2 = new P236.TreeNode(5);
        P236.TreeNode n3 = new P236.TreeNode(1);
        P236.TreeNode n4 = new P236.TreeNode(6);
        P236.TreeNode n5 = new P236.TreeNode(2);
        P236.TreeNode n6 = new P236.TreeNode(0);
        P236.TreeNode n7 = new P236.TreeNode(8);
        P236.TreeNode n8 = new P236.TreeNode(7);
        P236.TreeNode n9 = new P236.TreeNode(4);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n5.left = n8;
        n5.right = n9;

        P236.TreeNode aes = new P236().lowestCommonAncestor(n1,n2,n3);
        Assert.assertEquals(3,aes.val);

        aes = new P236().lowestCommonAncestor(n1,n2,n9);
        Assert.assertEquals(n2.val,aes.val);
    }
}
