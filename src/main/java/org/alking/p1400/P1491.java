package org.alking.p1400;

import java.util.Arrays;

public class P1491 {

    public double average(int[] salary) {

        Arrays.sort(salary);
        int sum = 0;
        for(int i = 1; i < salary.length-1;i++){
            sum += salary[i];
        }
        return ((double)sum)/ (salary.length-2);

    }
}
