package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._622;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _622Test {
    private _622.Solution1.MyCircularQueue myCircularQueue;

    @Test
    public void test1() {
        myCircularQueue = new _622.Solution1.MyCircularQueue(3);
        assertEquals(true, myCircularQueue.enQueue(1));
        assertEquals(true, myCircularQueue.enQueue(2));
        assertEquals(true, myCircularQueue.enQueue(3));
        assertEquals(false, myCircularQueue.enQueue(4));
        assertEquals(3, myCircularQueue.Rear());
        assertEquals(true, myCircularQueue.isFull());
        assertEquals(true, myCircularQueue.deQueue());
        assertEquals(true, myCircularQueue.enQueue(4));
        assertEquals(4, myCircularQueue.Rear());
    }

}