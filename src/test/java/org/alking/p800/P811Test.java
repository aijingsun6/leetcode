package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P811Test {

    @Test
    public void test(){
        P811 p811 = new P811();
        String[] cpdomains = new String[]{"9001 discuss.leetcode.com"};
        List<String> acc = p811.subdomainVisits(cpdomains);
        Assert.assertEquals(3, acc.size());
    }
}
