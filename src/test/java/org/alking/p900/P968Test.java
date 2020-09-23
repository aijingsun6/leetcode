package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P968Test {

    @Test
    public void test(){
        P968 p968 = new P968();
        int size = 4;
        P968.TreeNode[] nodes = new P968.TreeNode[size];
        for(int i = 0; i < size; i++){
            nodes[i] = new P968.TreeNode(i);
        }
        nodes[0].left = nodes[1];
        nodes[1].left = nodes[2];
        nodes[1].right = nodes[3];
        int res = p968.minCameraCover(nodes[0]);
        Assert.assertEquals(1,res);
    }
}
