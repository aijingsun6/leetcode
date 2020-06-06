package org.alking.array;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }
        List<Integer> acc = new ArrayList<>(digits.length + 1);
        int last = digits[digits.length - 1] + 1;
        int plus = last > 9 ? 1 : 0;
        acc.add(last % 10);
        for (int i = digits.length - 2; i >= 0; i--) {
            int v = digits[i];
            int v2 = v + plus;

            if (v2 > 9) {
                plus = 1;
            } else {
                plus = 0;
            }
            acc.add(v2 % 10);
        }
        if (plus > 0) {
            acc.add(1);
        }
        int size = acc.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = acc.get(size - 1 - i);
        }
        return result;
    }
}
