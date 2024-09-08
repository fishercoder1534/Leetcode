package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._155;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _155Test {
    private _155.Solution1.MinStack minStack1;
    private _155.Solution2.MinStack minStack2;

    @BeforeEach
    public void setup() {
        minStack1 = new _155.Solution1.MinStack();
        minStack2 = new _155.Solution2.MinStack();
    }

    @Test
    public void test1() {
        minStack1.push(-2);
        minStack1.push(0);
        minStack1.push(-3);
        assertEquals(-3, minStack1.getMin());
        minStack1.pop();
        assertEquals(0, minStack1.top());
        assertEquals(-2, minStack1.getMin());
    }

    @Test
    public void test2() {
        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-3);
        assertEquals(-3, minStack2.getMin());
        minStack2.pop();
        assertEquals(0, minStack2.top());
        assertEquals(-2, minStack2.getMin());
    }
}
