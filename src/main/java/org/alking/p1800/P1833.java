package org.alking.p1800;

public class P1833 {

//    public int maxIceCream(int[] costs, int coins) {
//        Arrays.sort(costs);
//        int acc = 0;
//        int sum = 0;
//        for (int i = 0; i < costs.length; i++) {
//            sum += costs[i];
//            if (sum > coins) {
//                break;
//            } else {
//                acc += 1;
//            }
//        }
//        return acc;
//    }

    public int maxIceCream(int[] costs, int coins) {
        int[] bucket = new int[100000 + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < costs.length; i++) {
            int v = costs[i];
            min = Math.min(v, min);
            bucket[v] += 1;
        }
        int acc = 0;
        int left = coins;
        for (int i = 1; i < 100001; i++) {
            int c = bucket[i];
            if (c < 1) {
                continue;
            }
            if (left < i) {
                break;
            }
            int calc = left / i;
            if (calc < c) {
                acc += calc;
                break;
            } else {
                acc += c;
                left -= i * c;
            }
        }
        return acc;
    }
}
