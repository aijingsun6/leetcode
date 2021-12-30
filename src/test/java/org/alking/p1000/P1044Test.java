package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1044Test {
    @Test
    public void test(){
        P1044 p1044 = new P1044();
        String s = "banana";
        Assert.assertEquals("ana",p1044.longestDupSubstring(s));
        s = "abcd";
        Assert.assertEquals("",p1044.longestDupSubstring(s));
        s = "bananananana";
        Assert.assertEquals("anananana",p1044.longestDupSubstring(s));
        s = "cegwiyckeddctcypjxtnafvxbjkflidfxsiriztevbfjsegyzbvmfvizwukjhbbpeuznmivchkoxaebmnftouskunyzrpyrggixkeoymcrqkjhoyqmojakrrhyxhtnxxgtpsdjqneioeamwmolweguznjlcecvlbzmryxurfhvecfhrgjstrvmltxayteornhumnmrwatsmwwdojloufxvshovaufayrobfxuyrkpulleqokfujjebyjxryfmjfdidotvuayjbgunszdplgbscunnjasgnxububsuqclixyorktxmrjvqzbjlrfraecmojixexbtvrjcymnvtqyxzxdzszyrfzarwtsglzwi";
        Assert.assertEquals("kjh",p1044.longestDupSubstring(s));

    }
}
