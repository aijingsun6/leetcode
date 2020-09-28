package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P707Test {

    @Test
    public void test(){
        P707 linkedList = new P707();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        Assert.assertEquals(1,linkedList.get(0));
        Assert.assertEquals(2,linkedList.get(1));
        Assert.assertEquals(3,linkedList.get(2));
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        Assert.assertEquals(3,linkedList.get(1));            //返回3
    }
}
