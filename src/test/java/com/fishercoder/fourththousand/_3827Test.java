package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3827;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3827Test {
    private _3827.Solution1 solution1;
    private _3827.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _3827.Solution1();
        solution2 = new _3827.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.countMonobit(7));
        assertEquals(4, solution2.countMonobit(7));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.countMonobit(13));
        assertEquals(4, solution2.countMonobit(13));
    }

}
