package org.alking.p1300;

import java.util.HashMap;

public class P1357 {


    public static class Cashier {

        private final HashMap<Integer, Integer> priceMap = new HashMap<>();
        private final int discount;
        private final int size;
        private int acc;

        public Cashier(int n, int discount, int[] products, int[] prices) {
            for (int i = 0; i < products.length; i++) {
                priceMap.put(products[i], prices[i]);
            }
            this.discount = discount;
            this.size = n;
            acc = 0;
        }

        public double getBill(int[] product, int[] amount) {
            double result = 0;
            for (int i = 0; i < product.length; i++) {
                result += this.priceMap.get(product[i]) * amount[i];
            }
            if (++acc % size == 0) {
                return result * (100 - this.discount)/100;
            }
            return result;
        }
    }
}
