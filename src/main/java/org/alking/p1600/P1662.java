package org.alking.p1600;

public class P1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        return String.join("",word1).equals(String.join("",word2));

    }
}
