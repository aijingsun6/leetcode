package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P273Test {
    @Test
    public void test(){
        P273 p273 = new P273();
        String s = p273.numberToWords(123);
        Assert.assertEquals("One Hundred Twenty Three",s);

        s = p273.numberToWords(1);
        Assert.assertEquals("One",s);

        s = p273.numberToWords(11);
        Assert.assertEquals("Eleven",s);

        s = p273.numberToWords(21);
        Assert.assertEquals("Twenty One",s);

        s = p273.numberToWords(12345);
        Assert.assertEquals("Twelve Thousand Three Hundred Forty Five",s);

        s = p273.numberToWords(1234567);
        Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",s);

        s = p273.numberToWords(1234567891);
        Assert.assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One",s);

        s = p273.numberToWords(100);
        Assert.assertEquals("One Hundred",s);

        s = p273.numberToWords(1000);
        Assert.assertEquals("One Thousand",s);

        s = p273.numberToWords(1000000);
        Assert.assertEquals("One Million",s);
    }
}
