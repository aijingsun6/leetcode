package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P830Test {

    @Test
    public void test(){
        P830 p830 = new P830();
        List<List<Integer>> ret=p830.largeGroupPositions("abbxxxxzzy");
        Assert.assertEquals(1, ret.size());

        ret=p830.largeGroupPositions("abcdddeeeeaabbbcd");
        Assert.assertEquals(3, ret.size());
    }
}
