package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P71Test {

    @Test
    public void test(){
        P71 p71 = new P71();
        String path = "/home/";
        String result = p71.simplifyPath(path);
        String expect = "/home";
        Assert.assertEquals(expect,result);

        path = "/../";
        result = p71.simplifyPath(path);
        expect = "/";
        Assert.assertEquals(expect,result);

        path = "/home//foo/";
        result = p71.simplifyPath(path);
        expect = "/home/foo";
        Assert.assertEquals(expect,result);

    }
}
