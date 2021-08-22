package org.alking.p1700;

public class P1700 {

    public int countStudents(int[] students, int[] sandwiches) {
        int sum0 = 0;
        int sum1 = 0;
        for (int v : students) {
            if (v > 0) {
                sum1++;
            } else {
                sum0++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] > 0) {
                if (--sum1 < 0) {
                    return sandwiches.length - i;
                }
            } else {
                if (--sum0 < 0) {
                    return sandwiches.length - i;
                }
            }
        }
        return 0;

    }
}
