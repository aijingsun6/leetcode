package org.alking.p500;

/**
 * https://leetcode-cn.com/problems/complex-number-multiplication/
 */
public class P537 {

    public String complexNumberMultiply(String num1, String num2) {

        int[] a = parseComplex(num1);
        int[] b = parseComplex(num2);
        int real = a[0]*b[0] - a[1]*b[1];
        int comp = a[1]*b[0] + a[0]*b[1];
        return String.format("%d+%di",real,comp);
    }

    // a+bi [a,b]
    public int[] parseComplex(String s) {
        int a = 0;
        int aa = 1;
        int b = 0;
        int bb = 1;
        char[] cs = s.toCharArray();
        boolean real = true;
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c == '+') {
                real = false;
            } else if (c == '-' && real) {
                aa = -1;
            } else if (c == '-') {
                bb = -1;
            } else if (c == 'i') {
            } else if (real) {
                a = a * 10 + c - '0';
            } else {
                b = b * 10 + c - '0';
            }
        }
        return new int[]{a * aa, b * bb};
    }

}
