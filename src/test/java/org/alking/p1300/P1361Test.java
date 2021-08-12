package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1361Test {

    @Test
    public void test(){
        P1361 p1361 = new P1361();
        int n = 4;
        int[] leftChild = new int[]{1,-1,3,-1};
        int[] rightChild = new int[]{2,-1,-1,-1};
        boolean result = p1361.validateBinaryTreeNodes(n,leftChild,rightChild);
        Assert.assertTrue(result);

        n = 4;
        leftChild = new int[]{1,-1,3,-1};
        rightChild = new int[]{2,3,-1,-1};
        result = p1361.validateBinaryTreeNodes(n,leftChild,rightChild);
        Assert.assertFalse(result);

        n = 2;
        leftChild = new int[]{1,0};
        rightChild = new int[]{-1,-1};
        result = p1361.validateBinaryTreeNodes(n,leftChild,rightChild);
        Assert.assertFalse(result);

        n = 6;
        leftChild = new int[]{1,-1,-1,4,-1,-1};
        rightChild = new int[]{2,-1,-1,5,-1,-1};
        result = p1361.validateBinaryTreeNodes(n,leftChild,rightChild);
        Assert.assertFalse(result);

    }
}
