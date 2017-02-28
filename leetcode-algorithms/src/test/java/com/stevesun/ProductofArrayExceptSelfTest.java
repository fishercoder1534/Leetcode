package com.stevesun;

import com.stevesun.solutions.ProductofArrayExceptSelf;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductofArrayExceptSelfTest {
    private static ProductofArrayExceptSelf test;
    private static int[] expected;
    private static int[] actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new ProductofArrayExceptSelf();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        actual = new int[]{};
    }

    @Test
    public void test1(){
        nums = new int[]{0, 0};
        expected = new int[]{0, 0};
        actual = test.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1, 0};
        expected = new int[]{0, 1};
        actual = test.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}
