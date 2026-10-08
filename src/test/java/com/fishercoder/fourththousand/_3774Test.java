package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3774;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3774Test {
    private _3774.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3774.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.absDifference(new int[]{5, 2, 2, 4}, 2));
    }

}
