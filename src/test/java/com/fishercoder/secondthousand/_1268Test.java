package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1268;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1268Test {
    private _1268.Solution1 solution1;
    private static List<List<String>> expected;
    private static String[] products;

    @BeforeEach
    public void setup() {
        solution1 = new _1268.Solution1();
    }

    @Test
    public void test1() {
        products = new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        expected =
                Arrays.asList(
                        Arrays.asList("mobile", "moneypot", "monitor"),
                        Arrays.asList("mobile", "moneypot", "monitor"),
                        Arrays.asList("mouse", "mousepad"),
                        Arrays.asList("mouse", "mousepad"),
                        Arrays.asList("mouse", "mousepad"));
        assertEquals(expected, solution1.suggestedProducts(products, "mouse"));
    }
}
