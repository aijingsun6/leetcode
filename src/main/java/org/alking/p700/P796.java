package org.alking.p700;

public class P796 {

    public boolean rotateString(String A, String B) {

        if (A == null || B == null) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        return  (A + A).contains(B);

    }
}
