package org.alking.common;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TreeNodeTest {

    TreeNode n = new TreeNode(0);

    @Test
    public void isValidBSTTest(){
        TreeNode n3 = new TreeNode(3);
        TreeNode n30 = new TreeNode(30);
        TreeNode n10 = new TreeNode(10);
        TreeNode n15 = new TreeNode(15);
        TreeNode n45 = new TreeNode(45);
        n3.right = n30;
        n30.left = n10;
        n10.right = n15;
        n15.right = n45;
        Assert.assertFalse(n.isValidBST(n3));

    }


    @Test
    public void levelOrderTest(){


    }


    @Test
    public void sortedArrayToBSTTest(){
        int[] arr = {1,2,3};
        TreeNode root = n.sortedArrayToBST(arr);
        Assert.assertEquals(2,root.val);
        Assert.assertEquals(1,root.left.val);
        Assert.assertEquals(3,root.right.val);

        arr = new int[]{1,2,3,4,5};
        root = n.sortedArrayToBST(arr);
        Assert.assertEquals(3,root.val);
        Assert.assertEquals(1,root.left.val);
        Assert.assertEquals(2,root.left.right.val);

        Assert.assertEquals(4,root.right.val);
        Assert.assertEquals(5,root.right.right.val);

    }

    @Test
    public void orderByStackTest(){
        int size = 7;
        TreeNode[] nodes = new TreeNode[size];
        for(int i = 0; i < size;i++){
            nodes[i] = new TreeNode(i);
        }
        nodes[0].left = nodes[1];
        nodes[0].right = nodes[2];

        nodes[1].left = nodes[3];
        nodes[1].right = nodes[4];

        nodes[2].left = nodes[5];
        nodes[2].right = nodes[6];


        ArrayList<TreeNode> acc = new ArrayList<>();

        nodes[0].orderByStack(nodes[0],acc);

        Assert.assertEquals(nodes[3],acc.get(0));
        Assert.assertEquals(nodes[1],acc.get(1));
        Assert.assertEquals(nodes[4],acc.get(2));
        Assert.assertEquals(nodes[0],acc.get(3));
        Assert.assertEquals(nodes[5],acc.get(4));
        Assert.assertEquals(nodes[2],acc.get(5));
        Assert.assertEquals(nodes[6],acc.get(6));

    }
}
