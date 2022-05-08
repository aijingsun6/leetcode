package org.alking.p0;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P99Test {

    @Test
    public void test() {

        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(2);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;

        P99 p99 = new P99();
        p99.recoverTree(n1);

        Assert.assertEquals(2, n1.val);

    }

    @Test
    public void test2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        n1.left = n2;
        n2.right = n3;
        P99 p99 = new P99();
        p99.recoverTree(n1);
        Assert.assertEquals(3, n1.val);
    }
}
