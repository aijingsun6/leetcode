package org.alking.p1500;

public class P1592 {

    void appendSpace(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
    }

    public String reorderSpaces(String text) {
        int total = text.length();
        text = text.trim();
        if (text.length() == 0) {
            return "";
        }
        String[] arr = text.split("\\s+");
        int real = 0;
        for (String s : arr) {
            real += s.length();
        }
        StringBuilder sb = new StringBuilder();
        if(arr.length == 1){
            sb.append(arr[0]);
            appendSpace(sb,total-real);
            return sb.toString();
        }
        int last = (total - real) % (arr.length - 1);
        int space = (total - real) / (arr.length - 1);

        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            appendSpace(sb, space);
            sb.append(arr[i]);
        }
        appendSpace(sb, last);
        return sb.toString();
    }
}
