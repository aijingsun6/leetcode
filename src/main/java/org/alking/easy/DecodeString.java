package org.alking.easy;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class DecodeString {

    public String decodeString(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        ArrayDeque<String> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        String pop;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == '[') {
                queue.addLast(sb.toString());
                queue.addLast("[");
                sb = new StringBuilder();
            } else if (c == ']') {
                String s2 = sb.toString();
                ArrayList<String> list = new ArrayList<>();
                list.add(s2);
                while (true){
                    pop = queue.removeLast();
                    if(pop.equals("[")){
                        break;
                    }else {
                        list.add(pop);
                    }
                }
                Collections.reverse(list);
                s2 = String.join("",list);
                String s1 = queue.removeLast();
                String s3 = decodeString(s1,s2);
                queue.addLast(s3);
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }

       queue.addLast(sb.toString());

        StringBuilder sbAcc = new StringBuilder();

        while (!queue.isEmpty()){
            String one = queue.removeFirst();
            sbAcc.append(one);
        }

        return sbAcc.toString();

    }

    public String decodeString(String s1, String s2) {
        int size = s1.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            char c = s1.charAt(i);
            if (Character.isDigit(c)) {
                String s3 = s1.substring(i, size);
                Integer num = Integer.valueOf(s3);
                for (int j = 0; j < num; j++) {
                    sb.append(s2);
                }
                return sb.toString();

            }else {
                sb.append(c);
            }
        }

        return sb.toString();

    }
}
