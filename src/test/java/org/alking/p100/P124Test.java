package org.alking.p100;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P124Test {

    @Test
    public void test(){
        P124 p124 = new P124();
        TreeNode[] nodes = new TreeNode[5];
        nodes[0] = new TreeNode(-10);
        nodes[1] = new TreeNode(9);
        nodes[2] = new TreeNode(20);
        nodes[3] = new TreeNode(15);
        nodes[4] = new TreeNode(7);
        nodes[0].left = nodes[1];
        nodes[0].right = nodes[2];
        nodes[2].left = nodes[3];
        nodes[2].right = nodes[4];
        int result = p124.maxPathSum(nodes[0]);
        Assert.assertEquals(42,result);
    }
    @Test
    public void test2(){
        P124 p124 = new P124();
        TreeNode[] nodes = new TreeNode[7];
        nodes[0] = new TreeNode(1);
        nodes[1] = new TreeNode(-2);
        nodes[2] = new TreeNode(-3);
        nodes[3] = new TreeNode(1);
        nodes[4] = new TreeNode(3);
        nodes[5] = new TreeNode(-2);
        nodes[6] = new TreeNode(-1);

        nodes[0].left = nodes[1];
        nodes[0].right = nodes[2];
        nodes[1].left = nodes[3];
        nodes[1].right = nodes[4];
        nodes[2].left = nodes[5];
        nodes[3].left = nodes[6];
        int result = p124.maxPathSum(nodes[0]);
        Assert.assertEquals(3,result);


    }
}
