package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P6Test {

    @Test
    public void test(){
        P6 p6 = new P6();
        String s = p6.convert("AB",1);
        Assert.assertEquals("AB",s);
        s = p6.convert2("PAYPALISHIRING",3);
        Assert.assertEquals("PAHNAPLSIIGYIR",s);

        s = p6.convert2("A",1);
        Assert.assertEquals("A",s);
    }
}
