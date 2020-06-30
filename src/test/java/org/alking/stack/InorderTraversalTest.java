package org.alking.stack;

import org.alking.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InorderTraversalTest {

    @Test
    public void inorderTraversalTest() {


        TreeNode root  = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        root.right = n2;
        n2.left = n3;

        InorderTraversal it = new InorderTraversal();
        List<Integer> result = it.inorderTraversal(root);
        Assert.assertEquals(1, result.get(0).intValue());
        Assert.assertEquals(3, result.get(1).intValue());
        Assert.assertEquals(2, result.get(2).intValue());

    }
}
