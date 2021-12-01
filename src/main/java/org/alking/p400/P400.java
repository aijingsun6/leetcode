package org.alking.p400;

public class P400 {


    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        int size = 0;
        int start = 0;
        int total = 0;
        int t;
        while (total < n) {
            size += 1;
            start = (int) (Math.pow(10, size - 1));

            t = total + start * size * 9;
            if (n <= t) {

                int idx = (n - total) / size;
                int rem = (n - total) % size;
                if (rem < 1) {
                    // 最后一位
                    return (start + idx - 1) % 10;
                }
                return ((start + idx) / (int) Math.pow(10, size - rem)) % 10;
            }
            total = t;
        }

        return 0;
    }
}
