package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3697;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3697Test {
    private _3697.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3697.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{500, 30, 7}, solution1.decimalRepresentation(537));
    }
}
