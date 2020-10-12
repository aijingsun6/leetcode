package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P530Test {

    @Test
    public void test(){
        // [543,384,652,null,445,null,699]
        //             543
        //            /    \
        //           384    652
        //            \       \
        //            445      699
        P530.TreeNode n1 = new P530.TreeNode(543);
        P530.TreeNode n2 = new P530.TreeNode(384);
        P530.TreeNode n3 = new P530.TreeNode(652);
        P530.TreeNode n4 = new P530.TreeNode(445);
        P530.TreeNode n5 = new P530.TreeNode(699);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;

        P530 p530 = new P530();
        int result = p530.getMinimumDifference(n1);
        Assert.assertEquals(47, result);


    }
}
