package org.alking.p200;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class P297Test {

    @Test
    public void test(){
        P297 p297 = new P297();
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p4 = new TreeNode(4);
        TreeNode p5 = new TreeNode(5);
        p1.left = p2;
        p1.right = p3;
        p3.left = p4;
        p3.right = p5;
        String s = p297.serialize(p1);
        Assert.assertEquals("[1,2,3,null,null,4,5]",s);

        TreeNode node = p297.deserialize(s);
        Assert.assertTrue(node.equals(p1));



    }

    @Test
    public void test2(){
        P297 p297 = new P297();
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p4 = new TreeNode(4);
        TreeNode p5 = new TreeNode(5);
        p1.right = p2;
        p2.right = p3;
        p3.right = p4;
        p4.right = p5;
        String s = p297.serialize(p1);
        System.out.println(s);

    }
}
