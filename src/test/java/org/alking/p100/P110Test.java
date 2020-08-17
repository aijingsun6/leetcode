package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P110Test {

    @Test
    public void test(){

        P110.TreeNode n1 = new P110.TreeNode(3);
        P110.TreeNode n2 = new P110.TreeNode(9);
        P110.TreeNode n3 = new P110.TreeNode(20);
        P110.TreeNode n4 = new P110.TreeNode(15);
        P110.TreeNode n5 = new P110.TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        P110 p110 = new P110();
        Assert.assertTrue(p110.isBalanced(n1));
    }
}
