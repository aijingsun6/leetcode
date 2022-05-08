package org.alking.p400;

public class P405 {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        int idx;
        while (num != 0) {
            idx = num & 0x0f;
            sb.append(hex[idx]);
            //无符号右移4位
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
