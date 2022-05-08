package org.alking.p800;

import java.util.Arrays;

public class P881 {

    public int numRescueBoats(int[] people, int limit) {

        if (people == null || people.length == 0) {
            return 0;
        }
        Arrays.sort(people);
        int count = 0;
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int v = people[right] + people[left];
            if (v > limit) {
                count++;
                right--;
                continue;
            }
            // v <= limit
            count++;
            left++;
            right--;
        }
        return count;
    }
}
