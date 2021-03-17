package org.alking.p1000;

public class P1006 {

    /**
     * 4 个数字为一组
     *
     * @param N
     * @return
     */
    public int clumsy(int N) {

        int acc = 0;
        boolean first = true;
        while (N > 0) {
            if (N > 3) {
                if (first) {
                    acc += N * (N - 1) / (N - 2);
                    first = false;
                } else {
                    acc -= N * (N - 1) / (N - 2);
                }
                acc += (N - 3);
            } else if (N > 2) {
                // N * (N-1)/(N-2)
                if (first) {
                    acc += N * (N - 1) / (N - 2);
                    first = false;
                } else {
                    acc -= N * (N - 1) / (N - 2);
                }
            } else if (N > 1) {
                // N *(N-1)
                if (first) {
                    acc += N * (N - 1);
                    first = false;
                } else {
                    acc -= N * (N - 1);
                }
            } else {
                if (first) {
                    acc += N;
                    first = false;
                } else {
                    acc -= N;
                }

            }
            N = N - 4;
        }
        return acc;
    }

}
