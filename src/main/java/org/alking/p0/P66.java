package org.alking.p0;

/**
 * https://leetcode-cn.com/problems/plus-one/
 */
public class P66 {


    public int[] plusOne(int[] digits) {

        int v = digits[digits.length - 1] + 1;
        int carry = v > 9 ? 1 : 0;
        digits[digits.length - 1] = v > 9 ? 0 : v;
        for (int i = digits.length - 2; i >= 0; i--) {
            v = carry + digits[i];
            if (v > 9) {
                carry = 1;
                digits[i] = 0;
            } else {
                carry = 0;
                digits[i] = v;
            }
        }

        if (carry < 1) {
            return digits;
        }

        int[] result = new int[1 + digits.length];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, digits.length);
        return result;
    }
}
