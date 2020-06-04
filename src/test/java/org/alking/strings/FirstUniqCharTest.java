package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqCharTest {

    @Test
    public void firstUniqCharTest(){
        FirstUniqChar fuc = new FirstUniqChar();
        Assert.assertEquals(0,fuc.firstUniqChar("leetcode"));
        Assert.assertEquals(2,fuc.firstUniqChar("loveleetcode"));
    }
}
