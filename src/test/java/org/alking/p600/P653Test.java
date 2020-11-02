package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P653Test {

    @Test
    public void test(){
        P653 p653 = new P653();
        P653.TreeNode n1 = new P653.TreeNode(2);
        P653.TreeNode n2 = new P653.TreeNode(1);
        P653.TreeNode n3 = new P653.TreeNode(3);
        n1.left = n2;
        n1.right = n3;
        boolean res = p653.findTarget(n1,4);
        Assert.assertTrue(res);
    }
}
