package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1352Test {

    @Test
    public void test(){
        P1352.ProductOfNumbers2 productOfNumbers  = new P1352.ProductOfNumbers2();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        Assert.assertEquals(20,productOfNumbers.getProduct(2)); // 返回 20 。最后 2 个数字的乘积是 5 * 4 = 20
        Assert.assertEquals(40,productOfNumbers.getProduct(3)); // 返回 40 。最后 3 个数字的乘积是 2 * 5 * 4 = 40
        Assert.assertEquals(0,productOfNumbers.getProduct(4)); // 返回  0 。最后 4 个数字的乘积是 0 * 2 * 5 * 4 = 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        Assert.assertEquals(32,productOfNumbers.getProduct(2));// 返回 32 。最后 2 个数字的乘积是 4 * 8 = 32

    }

    @Test
    public void test2(){
        P1352.ProductOfNumbers2 productOfNumbers  = new P1352.ProductOfNumbers2();
        productOfNumbers.add(1);
        productOfNumbers.getProduct(1);
        productOfNumbers.getProduct(1);
        productOfNumbers.getProduct(1);
        productOfNumbers.add(7);
        productOfNumbers.add(6);
        productOfNumbers.add(7);
    }
}
