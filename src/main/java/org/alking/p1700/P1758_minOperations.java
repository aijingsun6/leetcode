package org.alking.p1700;

public class P1758_minOperations {

    public int minOperations(String s) {

        // i%2 == 0 -> 0 i%2 == 1 -> 1
        int acc1 = 0;
        //
        int acc2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (c != '0') {
                    acc1++;
                }
                if (c != '1') {
                    acc2++;
                }
            } else {
                if (c != '1') {
                    acc1++;
                }
                if (c != '0') {
                    acc2++;
                }
            }

        }
        return Math.min(acc1, acc2);

    }
}
