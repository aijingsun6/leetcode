package org.alking.other;

public class HammingWeight {

    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                sum ++;
            }
        }
        return sum;
    }

}
