package org.alking.p1500;

public class P1518 {

    public int numWaterBottles(int numBottles, int numExchange) {

        int acc = 0;
        while (numBottles >= numExchange) {
            int n = numBottles / numExchange;
            int left = numBottles % numExchange;
            acc += (numBottles-left);
            numBottles = n + left;
        }
        acc += numBottles;
        return acc;
    }
}
