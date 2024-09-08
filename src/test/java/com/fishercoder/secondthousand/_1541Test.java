package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1541;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1541Test {
    private _1541.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1541.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minInsertions("(()))"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minInsertions("())"));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.minInsertions("))())("));
    }

    @Test
    public void test4() {
        assertEquals(12, solution1.minInsertions("(((((("));
    }

    @Test
    public void test5() {
        assertEquals(5, solution1.minInsertions(")))))))"));
    }

    @Test
    public void test6() {
        assertEquals(4, solution1.minInsertions("(()))(()))()())))"));
    }
}
