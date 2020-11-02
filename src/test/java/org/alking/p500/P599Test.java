package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P599Test {

    @Test
    public void test(){
        P599 p599 = new P599();
        String[] arr1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] arr2 = new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] res = p599.findRestaurant(arr1,arr2);
        Assert.assertEquals(1,res.length);
    }
}
