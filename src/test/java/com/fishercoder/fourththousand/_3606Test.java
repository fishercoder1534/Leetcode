package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3606;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3606Test {
    private _3606.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3606.Solution1();
    }

    @Test
    public void test1() {
        String[] code = new String[]{"SAVE20", "", "PHARMA5", "SAVE@20"};
        String[] businessLine = new String[]{"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean[] isActive = new boolean[]{true, true, true, true};
        assertEquals(Arrays.asList("PHARMA5", "SAVE20"), solution1.validateCoupons(code, businessLine, isActive));
    }

    @Test
    public void test2() {
        String[] code = new String[]{"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"};
        String[] businessLine = new String[]{"grocery", "electronics", "invalid"};
        boolean[] isActive = new boolean[]{false, true, true};
        assertEquals(Arrays.asList("ELECTRONICS_50"), solution1.validateCoupons(code, businessLine, isActive));
    }
}
