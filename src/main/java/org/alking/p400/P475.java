package org.alking.p400;

import java.util.Arrays;

public class P475 {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int result = 0;
        int x = 0;
        int y = 0;

        while (x < houses.length) {
            if (y < heaters.length) {
                if (houses[x] <= heaters[y] && y == 0) {
                    result = Math.max(result, heaters[y] - houses[x]);
                    x++;
                } else if (houses[x] <= heaters[y]) {
                    int min = heaters[y] - houses[x];
                    int z = y;
                    while (z > 0 && houses[x] <= heaters[z]) {
                        min = Math.min(min, heaters[z] - houses[x]);
                        z--;
                    }
                    if (houses[x] >= heaters[z]) {
                        min = Math.min(min, houses[x] - heaters[z]);
                    }
                    result = Math.max(result, min);
                    x++;
                } else if (houses[x] > heaters[y]) {
                    int min = houses[x] - heaters[y];
                    while (y < heaters.length && heaters[y] <= houses[x]) {
                        min = Math.min(min, houses[x] - heaters[y]);
                        y++;
                    }
                    if (y < heaters.length && houses[x] < heaters[y]) {
                        min = Math.min(min, heaters[y] - houses[x]);
                    }
                    result = Math.max(result, min);
                    x++;
                }
            } else {
                result = Math.max(result, Math.abs(houses[x] - heaters[heaters.length - 1]));
                x++;

            }
        }
        return result;
    }
}
