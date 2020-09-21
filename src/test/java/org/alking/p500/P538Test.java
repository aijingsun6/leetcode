package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P538Test {

    @Test
    public void test(){
        P538.TreeNode n1 = new P538.TreeNode(5);
        P538.TreeNode n2 = new P538.TreeNode(2);
        P538.TreeNode n3 = new P538.TreeNode(13);

        n1.left = n2;
        n1.right = n3;
        P538 p538 = new P538();

        P538.TreeNode result = p538.convertBST(n1);

        Assert.assertEquals(18,result.val);
    }


    @Test
    public void test2(){
        P538.TreeNode n1 = new P538.TreeNode(2);
        P538.TreeNode n2 = new P538.TreeNode(0);
        P538.TreeNode n3 = new P538.TreeNode(3);
        P538.TreeNode n4 = new P538.TreeNode(-4);
        P538.TreeNode n5 = new P538.TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        P538 p538 = new P538();

        P538.TreeNode result = p538.convertBST(n1);
        Assert.assertEquals(5,result.val);
    }
}
