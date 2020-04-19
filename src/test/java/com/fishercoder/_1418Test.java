package com.fishercoder;

import com.fishercoder.solutions._1418;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1418Test {
    private static _1418.Solution1 solution1;
    private static List<List<String>> orders;
    private static List<List<String>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1418.Solution1();
    }

    @Test
    public void test1() {
        orders = Arrays.asList(Arrays.asList("Laura", "2", "Bean Burrito"), Arrays.asList("Jhon", "2", "Beef Burrito"), Arrays.asList("Melissa", "2", "Soda"));
        expected = Arrays.asList(Arrays.asList("Table", "Bean Burrito", "Beef Burrito", "Soda"), Arrays.asList("2", "1", "1", "1"));
        assertEquals(expected, solution1.displayTable(orders));
    }

    @Test
    public void test2() {
        orders = Arrays.asList(Arrays.asList("James", "12", "Fried Chicken"), Arrays.asList("Ratesh", "12", "Fried Chicken"), Arrays.asList("Amadeus", "12", "Fried Chicken"), Arrays.asList("Adam", "1", "Canadian Waffles"), Arrays.asList("Brianna", "1", "Canadian Waffles"));
        expected = Arrays.asList(Arrays.asList("Table", "Canadian Waffles", "Fried Chicken"), Arrays.asList("1", "2", "0"), Arrays.asList("12", "0", "3"));
        assertEquals(expected, solution1.displayTable(orders));
    }

    @Test
    public void test3() {
        orders = Arrays.asList(Arrays.asList("David", "3", "Ceviche"), Arrays.asList("Corina", "10", "Beef Burrito"), Arrays.asList("David", "3", "Fried Chicken"), Arrays.asList("Carla", "5", "Water"), Arrays.asList("Carla", "5", "Ceviche"), Arrays.asList("Rous", "3", "Ceviche"));
        expected = Arrays.asList(Arrays.asList("Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"), Arrays.asList("3", "0", "2", "1", "0"), Arrays.asList("5", "0", "1", "0", "1"), Arrays.asList("10", "1", "0", "0", "0"));
        assertEquals(expected, solution1.displayTable(orders));
    }

}