package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2156;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2156Test {
    private _2156.Solution1 solution1;
    private static String s;
    private int power;
    private int modulo;
    private static int k;
    private static int hashValue;
    private static String expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2156.Solution1();
    }

    @Test
    public void test1() {
        s = "leetcode";
        power = 7;
        modulo = 20;
        k = 2;
        hashValue = 0;
        expected = "ee";
        assertEquals(expected, solution1.subStrHash(s, power, modulo, k, hashValue));
    }

    @Test
    public void test2() {
        s = "fbxzaad";
        power = 31;
        modulo = 100;
        k = 3;
        hashValue = 32;
        expected = "fbx";
        assertEquals(expected, solution1.subStrHash(s, power, modulo, k, hashValue));
    }

    @Test
    public void test3() {
        s = "xmmhdakfursinye";
        power = 96;
        modulo = 45;
        k = 15;
        hashValue = 21;
        expected = "xmmhdakfursinye";
        System.out.println(Math.pow(power, k - 1));
        System.out.println(Math.pow(power, k - 1) % modulo);
        assertEquals(expected, solution1.subStrHash(s, power, modulo, k, hashValue));
    }
}
