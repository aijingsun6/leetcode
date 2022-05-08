package org.alking.p900;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P987Test {

    @Test
    public void test(){
        P987 p987 = new P987();

        int n =  8;
        TreeNode[] nodes = new TreeNode[n];
        for(int i = 0; i < n; i++){
            nodes[i] = new TreeNode(i);
        }
        nodes[1].left = nodes[2];
        nodes[1].right = nodes[3];
        nodes[2].left = nodes[4];
        nodes[2].right = nodes[5];
        nodes[3].left = nodes[6];
        nodes[3].right = nodes[7];

        List<List<Integer>> result = p987.verticalTraversal(nodes[1]);
        Assert.assertEquals(5, result.size());



    }


}
