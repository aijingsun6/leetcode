package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P257Test {

    @Test
    public void test(){
        P257 p257 = new P257();
        P257.TreeNode n1 = new P257.TreeNode(1);
        P257.TreeNode n2 = new P257.TreeNode(2);
        P257.TreeNode n3 = new P257.TreeNode(3);
        P257.TreeNode n5 = new P257.TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n5;

        List<String> acc = p257.binaryTreePaths(n1);
        Assert.assertEquals(2, acc.size());

    }
}
