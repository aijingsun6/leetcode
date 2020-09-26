package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P437Test {

    @Test
    public void test(){

        P437.TreeNode n1 = new P437.TreeNode(10);
        P437.TreeNode n2 = new P437.TreeNode(5);
        P437.TreeNode n3 = new P437.TreeNode(-3);
        P437.TreeNode n4 = new P437.TreeNode(3);
        P437.TreeNode n5 = new P437.TreeNode(2);
        P437.TreeNode n6 = new P437.TreeNode(11);
        P437.TreeNode n7 = new P437.TreeNode(3);
        P437.TreeNode n8 = new P437.TreeNode(-2);
        P437.TreeNode n9 = new P437.TreeNode(1);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;
        n3.right = n6;

        n4.left = n7;
        n4.right = n8;
        n5.right = n9;
        int count = new P437().pathSum(n1,8);
        Assert.assertEquals(3,count);
    }
}
