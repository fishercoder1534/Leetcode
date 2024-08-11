package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1436;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1436Test {
    private _1436.Solution1 solution1;
    private static List<List<String>> paths;

    @BeforeEach
    public void setup() {
        solution1 = new _1436.Solution1();
    }

    @Test
    public void test1() {
        paths = Arrays.asList(Arrays.asList("Lima", "Sao Paulo"), Arrays.asList("New York", "Lima"), Arrays.asList("London", "New York"));
        assertEquals("Sao Paulo", solution1.destCity(paths));
    }

}