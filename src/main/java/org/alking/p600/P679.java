package org.alking.p600;

import java.util.ArrayList;
import java.util.List;

public class P679 {

    private static final double EPSILON = 1e-6;

    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<>(nums.length);
        for (int n : nums) {
            list.add((double) n);
        }
        System.out.println(String.format("judgePoint24:%s",list));
        return solve(24d, list);
    }

    public List<Double> ope(double m ,double n){
        List<Double> acc = new ArrayList<>();
        acc.add(m + n);
        acc.add( m - n);
        acc.add( n - m);
        acc.add( n * m);
        if(Math.abs(m) > EPSILON){
            acc.add( n / m);
        }

        if(Math.abs(n) > EPSILON){
            acc.add( m / n);
        }
        return acc;

    }

    private boolean solve(double target,double v, List<Double> list){
        if(Math.abs(v) < EPSILON){
            if(solve(target,list)){
                System.out.println(String.format("===  target:%f, v:%f, %s",target,v,list));
                return true;
            }

        }else {
            if (solve(target - v, list)) {
                System.out.println(String.format("-  target:%f, v:%f, %s",target,v,list));
                return true;
            }
            if (solve(v - target, list)) {
                System.out.println(String.format("-- target:%f, v:%f, %s",target,v,list));
                return true;
            }
            if (solve(target / v, list)) {
                System.out.println(String.format("/ target:%f, v:%f, %s",target,v,list));
                return true;
            }
            if (Math.abs(target) > EPSILON && solve(v / target, list)) {
                System.out.println(String.format("// target:%f, v:%f, %s",target,v,list));
                return true;
            }
            if (solve(target + v, list)) {
                System.out.println(String.format("+ target:%f, v:%f, %s",target,v,list));
                return true;
            }

            if (solve(target * v, list)) {
                System.out.println(String.format("* %f, %f, %s",target,v,list));
                return true;
            }
        }

        return false;
    }

    public boolean solve(double target, List<Double> list) {
        int size = list.size();
        if (size == 1) {
            double v = list.get(0);
            boolean ret = Math.abs(target - v) < EPSILON;
            if(ret){
                System.out.println(String.format("%f",v));
            }
            return ret;
        }

        if(size == 4){
            for(int i = 0; i < size; i++){
                for(int j = 0 ; j < size; j ++){
                    if( j != i){
                        double m = list.get(i);
                        double n = list.get(j);
                        List<Double> opes = ope(m,n);
                        List<Double> rest = new ArrayList<>();
                        for(int k = 0; k < size; k ++){
                            if(k != i && k != j){
                                rest.add(list.get(k));
                            }
                        }
                        for(double v : opes){
                            if(solve(target,v,rest)){
                                return true;
                            }
                        }
                    }
                }
            }
        }


        for (int i = 0; i < size; i++) {
            double v = list.get(i);
            List<Double> l2 = new ArrayList<>(size - 1);
            for (int j = 0; j < size; j++) {
                if (j != i) {
                    l2.add(list.get(j));
                }
            }
            if(solve(target,v,l2)){
                return true;
            }

        }

        return false;

    }

}
