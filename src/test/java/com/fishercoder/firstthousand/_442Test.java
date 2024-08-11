package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._442;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _442Test {
    private _442.Solution1 solution1;
    private _442.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _442.Solution1();
        solution2 = new _442.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 3), solution1.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        assertEquals(Arrays.asList(2, 3), solution2.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

}