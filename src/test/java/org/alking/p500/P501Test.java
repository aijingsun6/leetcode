package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P501Test {

    /**
     * [6,2,8,0,4,7,9,null,null,2,6]
     */
    @Test
    public void test() {

        P501 p501 = new P501();

        P501.TreeNode n1 = new P501.TreeNode(6);
        P501.TreeNode n2 = new P501.TreeNode(2);
        P501.TreeNode n3 = new P501.TreeNode(8);
        P501.TreeNode n4 = new P501.TreeNode(0);
        P501.TreeNode n5 = new P501.TreeNode(4);
        P501.TreeNode n6 = new P501.TreeNode(7);
        P501.TreeNode n7 = new P501.TreeNode(9);
        P501.TreeNode n8 = new P501.TreeNode(2);
        P501.TreeNode n9 = new P501.TreeNode(6);
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
