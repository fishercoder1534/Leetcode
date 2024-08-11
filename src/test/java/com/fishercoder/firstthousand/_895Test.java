package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._895;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _895Test {

    private _895.Solution1.FreqStack freqStack;

    @BeforeEach
    public void setup() {
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