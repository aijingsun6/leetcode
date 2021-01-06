package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P399Test {

    @Test
    public void test(){

        P399 p399 = new P399();
        List<List<String>> equations = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("b","c")
        );
        double[] values = new double[]{2.0d,3.0d};

        List<List<String>> queries =  Arrays.asList(
                Arrays.asList("a","c"),
                Arrays.asList("b","a"),
                Arrays.asList("a","e"),
                Arrays.asList("a","a"),
                Arrays.asList("x","x")
        );

        double[] result = p399.calcEquation(equations,values,queries);
        double[] expect = new double[]{6d,0.5d,-1d,1d,-1d};
        for(int i = 0;i < result.length;i++){
            Assert.assertEquals(expect[i],result[i],0.001d);
        }
    }
}
