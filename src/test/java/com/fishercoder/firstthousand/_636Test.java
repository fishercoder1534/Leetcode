package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._636;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _636Test {
    private _636.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _636.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 4}, solution1.exclusiveTime(2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6")));
    }

}
