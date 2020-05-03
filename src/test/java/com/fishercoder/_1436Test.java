package com.fishercoder;

import com.fishercoder.solutions._1436;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class _1436Test {
    private static _1436.Solution1 solution1;
    private static List<List<String>> paths;

    @BeforeClass
    public static void setup() {
        solution1 = new _1436.Solution1();
    }

    @Test
    public void test1() {
        paths = Arrays.asList(Arrays.asList("Lima", "Sao Paulo"), Arrays.asList("New York", "Lima"), Arrays.asList("London", "New York"));
        assertEquals("Sao Paulo", solution1.destCity(paths));
    }

}