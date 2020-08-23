package org.alking.p200;

public class P201 {

    public int rangeBitwiseAnd(int m, int n) {


        int shift = 0;
        // 找到公共前缀
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;

    }
}
