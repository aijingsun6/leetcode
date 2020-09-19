package org.alking.p1300;

public class P1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int num = 0;

        for(int v1: arr1){
           if(!findDist(arr2,d, v1)){
               num += 1;
           }
        }
        return num;
    }


    private boolean findDist(int[] arr2, int d,int value){


        for(int v: arr2){

            if(Math.abs( v - value) <= d){

                return true;

            }
        }

        return false;
    }

}
