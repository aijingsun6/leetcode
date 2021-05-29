package org.alking.p600;

import java.util.ArrayDeque;
import java.util.List;

public class P636 {

    public static final String STATUS_START = "start";

    public static final String STATUS_END = "end";

    static class Function {

        int idx;

        String status;

        int ts;

        int acc = 0;

        public Function() {
        }

        @Override
        public String toString() {
            return "{" +
                    "idx=" + idx +
                    ", status='" + status + '\'' +
                    ", ts=" + ts +
                    ", acc=" + acc +
                    '}';
        }

        public static Function parse(String s) {
            Function f = new Function();
            String[] arr = s.split(":");
            f.idx = Integer.valueOf(arr[0]);
            f.status = arr[1];
            f.ts = Integer.valueOf(arr[2]);
            return f;
        }
    }

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        ArrayDeque<Function> stack = new ArrayDeque<>();
        for (String s : logs) {
            Function func = Function.parse(s);
            if (STATUS_START.equals(func.status)) {
                if (!stack.isEmpty()) {
                    Function peek = stack.peekLast();
                    peek.acc = peek.acc + func.ts - peek.ts;
                }
                stack.addLast(func);
            } else if(STATUS_END.equals(func.status)){
                Function pop = stack.removeLast();
                int cost = func.ts - pop.ts + 1 + pop.acc;
                result[func.idx] += cost;
                if (!stack.isEmpty()) {
                    Function peek = stack.peekLast();
                    peek.ts = func.ts + 1;
                }
            }
        }
        return result;
    }
}
