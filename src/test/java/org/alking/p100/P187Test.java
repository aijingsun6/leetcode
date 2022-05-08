package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P187Test {

    @Test
    public void test(){
        P187 p187 = new P187();
        List<String> res = p187.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        Assert.assertEquals(2,res.size());
        Assert.assertEquals("AAAAACCCCC",res.get(0));
        Assert.assertEquals("CCCCCAAAAA",res.get(1));


        res = p187.findRepeatedDnaSequences("AAAAAAAAAAAAA");
        Assert.assertEquals(1,res.size());

    }
}
