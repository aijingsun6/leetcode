package org.alking.p0;

import java.util.*;
import java.util.stream.Collectors;

public class P43 {

    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        List<Integer> n1 = parseValue(num1);
        List<Integer> n2 = parseValue(num2);
        List<Integer> result = multiply(n1, n2);
        StringBuilder sb = new StringBuilder();
        result.forEach(x -> sb.append(String.valueOf(x)));
        return sb.toString();
    }

    private List<Integer> parseValue(String s) {
        if (s == null || s.length() == 0) {
            return Arrays.asList(0);
        }
        List<Integer> acc = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            acc.add(c - '0');
        }
        return acc;
    }

    private int findValue(List<Integer> list, int index) {

        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return 0;
    }

    public List<Integer> multiply(List<Integer> n1, List<Integer> n2) {
        List<List<Integer>> acc = new ArrayList<>();
        int size = n2.size();
        for (int idx = 0; idx < size; idx++) {
            final int fid = idx;
            List<Integer> n = n1.stream().map(x -> x * n2.get(size - 1 - fid)).collect(Collectors.toList());
            // fill zero
            for (int x = 0; x < fid; x++) {
                n.add(0);
            }
            acc.add(n);
        }
        return add(acc);
    }

    public List<Integer> add(List<List<Integer>> param) {
        int max = param.stream().map(x -> x.size()).max((o1, o2) -> o1 - o2).orElse(0);
        int add = 0;
        List<Integer> acc = new ArrayList<>();
        for (int idx = 0; idx < max; idx++) {
            final int finalIdx = idx;
            int sum = param.stream().mapToInt(x -> findValue(x, x.size() - 1 - finalIdx)).sum() + add;
            acc.add(sum % 10);
            add = sum / 10;
        }
        while (add > 0) {
            acc.add(add % 10);
            add = add / 10;
        }
        Collections.reverse(acc);
        return acc;
    }
}
