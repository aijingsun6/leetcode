package org.alking.p300;

public class P318 {

    public int maxProduct(String[] words) {
        int[] array = new int[words.length];
        int[] sizeArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            array[i] = hex(words[i]);
            sizeArray[i] = words[i].length();
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if ((array[i] & array[j]) == 0) {

                    max = Math.max(max, sizeArray[i] * sizeArray[j]);
                }

            }
        }
        return max;
    }

    public int hex(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int shift = s.charAt(i) - 'a' + 1;
            sum |= 1 << shift;
        }
        return sum;

    }

}
