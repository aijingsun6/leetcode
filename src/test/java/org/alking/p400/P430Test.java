package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P430Test {

    @Test
    public void test(){
        P430.Node n1 = new P430.Node(1);
        P430.Node n2 = new P430.Node(2);
        P430.Node n3 = new P430.Node(3);
        P430.Node n4 = new P430.Node(4);
        P430.Node n5 = new P430.Node(5);
        P430.Node n6 = new P430.Node(6);
        P430.Node n7 = new P430.Node(7);
        P430.Node n8 = new P430.Node(8);
        P430.Node n9 = new P430.Node(9);
        P430.Node n10 = new P430.Node(10);
        P430.Node n11 = new P430.Node(11);
        P430.Node n12 = new P430.Node(12);


        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        n5.next = n6;
        n6.prev = n5;

        n7.next = n8;
        n8.prev = n7;

        n8.next = n9;
        n9.prev = n8;

        n9.next = n10;
        n10.prev = n9;

        n11.next = n12;
        n12.prev = n11;

        n3.child = n7;
        n8.child = n11;

        P430 p430 = new P430();
        P430.Node ret = p430.flatten(n1);
        Assert.assertEquals(1, ret.val);
        p430.display(ret);
    }
}
