package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._358;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _358Test {

    private _358.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _358.Solution1();
    }

    @Test
    public void test1() {
        System.out.println(solution1.rearrangeString("aabbcc", 3));
    }

    @Test
    public void test2() {
        System.out.println(solution1.rearrangeString("aaabc", 3));
    }

    @Test
    public void test3() {
        System.out.println(solution1.rearrangeString("aaadbbcc", 2));
    }
}
