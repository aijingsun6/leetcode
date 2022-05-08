package org.alking.p500;

import java.util.Random;

public class P519 {

    public static class Solution {

        private int size;
        private int index;
        private int col;
        private int[] array;
        private final Random random = new Random();

        public Solution(int m, int n) {

            size = m * n;
            index = 0;
            col = n;
            this.array = new int[size];
            for(int i = 0; i < size;i++){
                array[i] = i;
            }

        }

        public int[] flip() {
            if(index >= size){
                return new int[]{0,0};
            }

            int c = random.nextInt(size - index);
            int v = array[index+c];
            // swap index and index + c
            int t = array[index];
            array[index] = array[index+c];
            array[index+c] = t;
            index += 1;
            return new int[]{v / col,v % col};
        }

        public void reset() {
            index = 0;
            this.array = new int[size];
            for(int i = 0; i < size;i++){
                array[i] = i;
            }
        }
    }
}
