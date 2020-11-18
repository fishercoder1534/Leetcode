package com.fishercoder;

import com.fishercoder.solutions._1268;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1268Test {
    private static _1268.Solution1 solution1;
    private static List<List<String>> expected;
    private static String[] products;

    @BeforeClass
    public static void setup() {
        solution1 = new _1268.Solution1();
    }

    @Test
    public void test1() {
        products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        expected = Arrays.asList(Arrays.asList("mobile", "moneypot", "monitor"), Arrays.asList("mobile", "moneypot", "monitor"), Arrays.asList("mouse", "mousepad"), Arrays.asList("mouse", "mousepad"), Arrays.asList("mouse", "mousepad"));
        assertEquals(expected, solution1.suggestedProducts(products, "mouse"));
    }
}
