package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P893Test {

    @Test
    public void test(){
        P893 p893 = new P893();

        Assert.assertTrue(p893.strEqual("abcd","cdab"));

        String[] A = new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        int res = p893.numSpecialEquivGroups(A);
        Assert.assertEquals(3, res);

    }
}
