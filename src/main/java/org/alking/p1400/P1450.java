package org.alking.p1400;

public class P1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int sum = 0;
        for(int i = 0; i < startTime.length;i++){

            if(startTime[i]<= queryTime && queryTime <= endTime[i]){
                sum += 1;
            }

        }
        return sum;

    }
}
