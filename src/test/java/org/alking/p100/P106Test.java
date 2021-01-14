package org.alking.p100;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P106Test {

    @Test
    public void test(){
        P106 p106 = new P106();
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        TreeNode root = p106.buildTree(inorder,postorder);
        Assert.assertEquals(3,root.val);

        inorder = new int[]{1,2,3,4};
        postorder = new int[]{3,2,4,1};
        root = p106.buildTree(inorder,postorder);
        Assert.assertEquals(1,root.val);
    }
}
