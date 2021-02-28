package com.fishercoder;

import com.fishercoder.solutions._895;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _895Test {

    private static _895.Solution1.FreqStack freqStack;

    @BeforeClass
    public static void setup() {
        freqStack = new _895.Solution1.FreqStack();
    }

    @Test
    public void test1() {
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
        assertEquals(5, freqStack.pop());
        assertEquals(7, freqStack.pop());
        assertEquals(5, freqStack.pop());
        assertEquals(4, freqStack.pop());
    }

}