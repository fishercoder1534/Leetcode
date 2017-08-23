package com.fishercoder;

import com.fishercoder.solutions._358;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by stevesun on 6/8/17.
 */
public class _358Test {

    private static _358 test;

    @BeforeClass
    public static void setup() {
        test = new _358();
    }

    @Test
    public void test1() {
        System.out.println(test.rearrangeString("aabbcc", 3));
    }

    @Test
    public void test2() {
        System.out.println(test.rearrangeString("aaabc", 3));
    }

    @Test
    public void test3() {
        System.out.println(test.rearrangeString("aaadbbcc", 2));
    }
}
