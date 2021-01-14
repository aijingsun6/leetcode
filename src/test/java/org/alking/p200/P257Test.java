package org.alking.p200;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P257Test {

    @Test
    public void test(){
        P257 p257 = new P257();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n5;

        List<String> acc = p257.binaryTreePaths(n1);
        Assert.assertEquals(2, acc.size());

    }
}
