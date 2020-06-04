package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindromeTest {

    @Test
    public void isPalindromeTest(){
        IsPalindrome ip = new IsPalindrome();
        Assert.assertTrue(ip.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(ip.isPalindrome("race a car"));
    }
}
