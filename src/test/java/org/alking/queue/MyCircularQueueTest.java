package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class MyCircularQueueTest {

    @Test
    public void test(){
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        Assert.assertTrue(circularQueue.enQueue(1));  // 返回 true


        Assert.assertTrue(circularQueue.enQueue(2));  // 返回 true
        Assert.assertTrue(circularQueue.enQueue(3));  // 返回 true
        Assert.assertFalse(circularQueue.enQueue(4));  // 返回 false，队列已满
        Assert.assertEquals(3, circularQueue.Rear());  // 返回 3
        Assert.assertTrue(circularQueue.isFull());  // 返回 true
        Assert.assertTrue(circularQueue.deQueue());  // 返回 true
        Assert.assertTrue(circularQueue.enQueue(4));  // 返回 true
        Assert.assertEquals(4,circularQueue.Rear());  // 返回 4
    }
}
