package com.fishercoder.fifththousand;

import com.fishercoder.solutions.fifththousand._4106;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4106Test {
    private _4106.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4106.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(Arrays.asList("ar", "mp"), Arrays.asList("h", "y")), solution1.findMismatchedSegments("earth", "empty"));
    }

}
