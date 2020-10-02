package org.alking.p300;

public class P345 {

    public String reverseVowels(String s) {

        if (s.isEmpty()) {
            return s;
        }

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            while (!isAEIOU(arr[left]) && left < right) {
                left += 1;
            }
            while (!isAEIOU(arr[right]) && left < right) {
                right -= 1;
            }
            char t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left += 1;
            right -= 1;
        }
        return new String(arr);

    }

    private boolean isAEIOU(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;

        }
    }
}
