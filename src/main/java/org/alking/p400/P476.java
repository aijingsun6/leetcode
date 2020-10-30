package org.alking.p400;

public class P476 {


    public int findComplement(int num) {
        int origin = num;
        num |= num >>> 1;
        num |= num >>> 2;
        num |= num >>> 4;
        num |= num >>> 8;
        num |= num >>> 16;
        return num - origin;
    }
}
