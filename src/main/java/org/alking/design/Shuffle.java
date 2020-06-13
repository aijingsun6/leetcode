package org.alking.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

    class Solution {

        private final int[] arr;

        public Solution(int[] nums) {

            arr = nums;
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return arr;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            if(arr == null){
                return null;
            }
            List<Integer> list = new ArrayList<>();
            for(int n : arr){
                list.add(n);
            }
            Collections.shuffle(list);
            Integer[] acc = new Integer[arr.length];
            list.toArray(acc);
            int[] result = new int[arr.length];
            for(int i = 0; i < arr.length;i++){
                result[i] = acc[i];
            }
            return result;
        }
    }
}
