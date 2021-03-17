package org.alking.p1600;

public class P1603 {


    class ParkingSystem {

        private int[] leftArray = new int[4];

        public ParkingSystem(int big, int medium, int small) {
            leftArray[1] = big;
            leftArray[2] = medium;
            leftArray[3] = small;
        }

        public boolean addCar(int carType) {
            return leftArray[carType]-- > 0;
        }
    }
}
