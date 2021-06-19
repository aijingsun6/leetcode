package org.alking.p1300;

public class P1342 {

    public int numberOfSteps(int num) {

        int step = 0;
        while (num > 0){
            if(num %2 == 0){
                num = num / 2;
            }else{
                num = num - 1;
            }
            step += 1;
        }
        return step;

    }
}
