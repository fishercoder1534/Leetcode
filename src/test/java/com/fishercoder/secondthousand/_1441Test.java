package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1441;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1441Test {
    private _1441.Solution1 solution1;
    private static int[] target;

    @BeforeEach
    public void setup() {
        solution1 = new _1441.Solution1();
    }

    @Test
    public void test1() {
        target = new int[] {1, 3};
        assertEquals(Arrays.asList("Push", "Push", "Pop", "Push"), solution1.buildArray(target, 3));
    }
}
