package org.alking.p300;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P337Test {

    @Test
    public void test(){
        P337 p337 = new P337();
        TreeNode[] nodes = new TreeNode[5];
        nodes[0] = new TreeNode(3);
        nodes[1] = new TreeNode(2);
        nodes[2] = new TreeNode(3);
        nodes[3] = new TreeNode(3);
        nodes[4] = new TreeNode(1);

        nodes[0].left = nodes[1];
        nodes[0].right = nodes[2];
        nodes[1].right = nodes[3];
        nodes[2].right = nodes[4];
        int result = p337.rob(nodes[0]);
        Assert.assertEquals(7,result);


    }
}
