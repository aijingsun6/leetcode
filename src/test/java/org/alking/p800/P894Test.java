package org.alking.p800;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P894Test {

    @Test
    public void test() {
        P894 p894 = new P894();
        List<TreeNode> result = p894.allPossibleFBT(3);
        Assert.assertEquals(1,result.size());

        result = p894.allPossibleFBT(7);
        Assert.assertEquals(5,result.size());
    }
}
