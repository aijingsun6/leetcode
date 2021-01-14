package org.alking.p500;

import org.alking.common.TreeNode;
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
        TreeNode n1 = new TreeNode(543);
        TreeNode n2 = new TreeNode(384);
        TreeNode n3 = new TreeNode(652);
        TreeNode n4 = new TreeNode(445);
        TreeNode n5 = new TreeNode(699);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;

        P530 p530 = new P530();
        int result = p530.getMinimumDifference(n1);
        Assert.assertEquals(47, result);


    }
}
