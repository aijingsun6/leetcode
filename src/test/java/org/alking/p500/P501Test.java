package org.alking.p500;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P501Test {

    /**
     * [6,2,8,0,4,7,9,null,null,2,6]
     */
    @Test
    public void test() {

        P501 p501 = new P501();

        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(9);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(6);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.left = n8;
        n5.right = n9;
        int[] result = p501.findMode(n1);
        Assert.assertEquals(2, result.length);


    }
}
