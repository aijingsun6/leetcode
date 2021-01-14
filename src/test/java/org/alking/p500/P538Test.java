package org.alking.p500;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P538Test {

    @Test
    public void test(){
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(13);

        n1.left = n2;
        n1.right = n3;
        P538 p538 = new P538();

        TreeNode result = p538.convertBST(n1);

        Assert.assertEquals(18,result.val);
    }


    @Test
    public void test2(){
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(-4);
        TreeNode n5 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        P538 p538 = new P538();

        TreeNode result = p538.convertBST(n1);
        Assert.assertEquals(5,result.val);
    }
}
