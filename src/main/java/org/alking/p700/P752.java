package org.alking.p700;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P752 {

    public static final int STATE_ZERO = 0;
    public static final int STATE_VISIT = 1;
    public static final int STATE_DEAD = 2;

    private final int VALUE_MIN = 0;
    private final int VALUE_MAX = 10000;

    private final char[] ARRAY = new char[4];

    private int[] VISIT = new int[VALUE_MAX];

    private int calcValue(String s) {
        int acc = 0;
        acc += 1000 * (s.charAt(0) - '0');
        acc += 100 * (s.charAt(1) - '0');
        acc += 10 * (s.charAt(2) - '0');
        acc += (s.charAt(3) - '0');
        return acc;
    }

    private int calcValue() {
        int acc = 0;
        acc += 1000 * (ARRAY[0] - '0');
        acc += 100 * (ARRAY[1] - '0');
        acc += 10 * (ARRAY[2] - '0');
        acc += (ARRAY[3] - '0');
        return acc;
    }

    private boolean checkValue(final int v) {
        if (v <= VALUE_MIN || v >= VALUE_MAX) {
            return false;
        }
        return VISIT[v] == STATE_ZERO;
    }

    private List<Integer> nearBy(int v) {
        final List<Integer> acc = new ArrayList<>();

        int[] op = new int[]{1000, 100, 10, 1};
        for (int i = 0; i < 4; i++) {
            ARRAY[i] = (char) (v / op[i] + '0');
            v = v % op[i];
        }
        for (int i = 0; i < 4; i++) {
            char old = ARRAY[i];
            int n = old - '0';
            int n2 = (10 + n - 1) % 10;
            ARRAY[i] = (char) (n2 + '0');
            int value = calcValue();
            if (checkValue(value)) {
                acc.add(value);
            }

            n2 = (10 + n + 1) % 10;
            ARRAY[i] = (char) (n2 + '0');
            value = calcValue();
            if (checkValue(value)) {
                acc.add(value);
            }
            ARRAY[i] = old;
        }
        return acc;
    }

    public int openLock(String[] deadends, String targetS) {
        Arrays.fill(VISIT, STATE_ZERO);
        for (String s : deadends) {
            int value = calcValue(s);
            VISIT[value] = STATE_DEAD;
            if (value == 0) {
                return -1;
            }
        }
        final int target = calcValue(targetS);
        if (target == 0) {
            return 0;
        }
        if (VISIT[target] == STATE_DEAD) {
            return -1;
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int acc = 0;
        queue.addLast(0);
        VISIT[0] = STATE_VISIT;
        while (!queue.isEmpty()) {
            acc += 1;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer pop = queue.removeFirst();
                List<Integer> near = nearBy(pop);
                for (Integer n : near) {
                    if (n.equals(target)) {
                        return acc;
                    }
                    VISIT[n] = STATE_VISIT;
                    queue.addLast(n);
                }
            }

        }
        return -1;

    }

}
