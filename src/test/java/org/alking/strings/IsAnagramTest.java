package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class IsAnagramTest {

    @Test
    public void isAnagramTest(){
        IsAnagram ia = new IsAnagram();
        Assert.assertTrue(ia.isAnagram("anagram","nagaram"));
        Assert.assertFalse(ia.isAnagram("rat","car"));
    }
}
