package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P720Test {

    @Test
    public void test(){
        P720 p720 = new P720();
        String[] ss = new String[]{"w","wo","wor","worl", "world"};
        String r = p720.longestWord2(ss);
        Assert.assertEquals("world",r);

        ss = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        r = p720.longestWord2(ss);
        Assert.assertEquals("apple",r);
    }
}
