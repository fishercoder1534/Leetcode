package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3223;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3223Test {
    private static _3223.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3223.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(38, solution1.minimumLength("ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj"));
    }
}