package org.alking.p600;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P653Test {

    @Test
    public void test(){
        P653 p653 = new P653();
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        n1.left = n2;
        n1.right = n3;
        boolean res = p653.findTarget(n1,4);
        Assert.assertTrue(res);
    }
}
