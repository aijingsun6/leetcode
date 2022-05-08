package org.alking.mian;

import org.alking.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class M0402Test {
    @Test
    public void test(){
        M0402 m0402 = new M0402();
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode root = m0402.sortedArrayToBST(nums);
        Assert.assertEquals(0,root.val);
    }
}
