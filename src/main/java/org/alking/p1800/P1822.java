package org.alking.p1800;

public class P1822 {

    public int arraySign(int[] nums) {
        int c = 0;
        for (int v : nums) {
            if (v == 0) {
                return 0;
            } else if (v < 0) {
                c++;
            }
        }
        return c % 2 == 0 ? 1 : -1;
    }
}
