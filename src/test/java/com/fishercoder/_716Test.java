package com.fishercoder;

import com.fishercoder.solutions._716;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _716Test {
    private static _716.Solution1.MaxStack maxStackSolution1;
    private static _716.Solution2.MaxStack maxStackSolution2;
    private static _716.Solution3.MaxStack maxStackSolution3;

    @Before
    public void setup() {
        maxStackSolution1 = new _716.Solution1.MaxStack();
        maxStackSolution2 = new _716.Solution2.MaxStack();
        maxStackSolution3 = new _716.Solution3.MaxStack();
    }

    @Test
    public void test1() {
        maxStackSolution1.push(5);
        assertEquals(5, maxStackSolution1.peekMax());
        maxStackSolution2.push(5);
        assertEquals(5, maxStackSolution2.popMax());
        maxStackSolution3.push(5);
        assertEquals(5, maxStackSolution3.popMax());
    }

    @Test
    public void test2() {
        maxStackSolution1.push(5);
        maxStackSolution1.push(1);
        assertEquals(5, maxStackSolution1.popMax());
        assertEquals(1, maxStackSolution1.peekMax());
    }

    @Test
    public void test3() {
        maxStackSolution1.push(74);
        assertEquals(74, maxStackSolution1.popMax());
        maxStackSolution1.push(89);
        maxStackSolution1.push(67);
        assertEquals(89, maxStackSolution1.popMax());
        assertEquals(67, maxStackSolution1.pop());
        maxStackSolution1.push(61);
        maxStackSolution1.push(-77);
        assertEquals(61, maxStackSolution1.peekMax());
        assertEquals(61, maxStackSolution1.popMax());
        maxStackSolution1.push(81);
        assertEquals(81, maxStackSolution1.peekMax());
        assertEquals(81, maxStackSolution1.popMax());
        maxStackSolution1.push(81);
        assertEquals(81, maxStackSolution1.pop());
        maxStackSolution1.push(-71);
        maxStackSolution1.push(32);
    }

    @Test
    public void test4() {
        maxStackSolution2.push(5);
        assertEquals(5, maxStackSolution2.peekMax());
        assertEquals(5, maxStackSolution2.popMax());
    }

    @Test
    public void test5() {
        maxStackSolution2.push(5);
        maxStackSolution2.push(1);
        assertEquals(5, maxStackSolution2.popMax());
        assertEquals(1, maxStackSolution2.peekMax());
    }

    @Test
    public void test6() {
        maxStackSolution2.push(74);
        assertEquals(74, maxStackSolution2.popMax());
        maxStackSolution2.push(89);
        maxStackSolution2.push(67);
        assertEquals(89, maxStackSolution2.popMax());
        assertEquals(67, maxStackSolution2.pop());
        maxStackSolution2.push(61);
        maxStackSolution2.push(-77);
        assertEquals(61, maxStackSolution2.peekMax());
        assertEquals(61, maxStackSolution2.popMax());
        maxStackSolution2.push(81);
        assertEquals(81, maxStackSolution2.peekMax());
        assertEquals(81, maxStackSolution2.popMax());
        maxStackSolution2.push(81);
        assertEquals(81, maxStackSolution2.pop());
        maxStackSolution2.push(-71);
        maxStackSolution2.push(32);
    }
}
