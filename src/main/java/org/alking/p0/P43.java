package org.alking.p0;

public class P43 {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int s1 = num1.length();
        int s2 = num2.length();
        int s = s1 + s2;
        int[] arr = new int[s];
        int max = s1 + s2 - 2;
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                int idx = i + j;
                arr[idx] = arr[idx] + (num1.charAt(s1 - 1 - i) - '0') * (num2.charAt(s2 - 1 - j) - '0');
            }
        }
        int carry = 0;
        int t;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= max; i++) {
            t = arr[i] + carry;
            carry = t / 10;
            sb.append(t % 10);
        }
        while (carry > 0) {
            sb.append(carry % 10);
            carry = carry / 10;
        }
        return sb.reverse().toString();
    }
}
