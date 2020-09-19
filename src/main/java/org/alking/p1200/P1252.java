package org.alking.p1200;

public class P1252 {


    public int oddCells(int n, int m, int[][] indices) {


        int[] arrN = new int[n];
        int[] arrM = new int[m];

        for(int[] inc: indices){
            arrN[inc[0]] += 1;
            arrM[inc[1]] += 1;
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){

                if( (arrN[i] + arrM[j]) %2 == 1  ){
                    sum += 1;
                }
            }
        }
        return sum;

    }
}
