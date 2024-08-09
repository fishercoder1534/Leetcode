package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.Employee;
import com.fishercoder.solutions.firstthousand._690;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 5/18/17.
 */
public class _690Test {
    private _690.Solution1 solution1;
    private static List<Employee> employees;
    private static int id;

    @BeforeEach
    public void setupForEachTest() {
        solution1 = new _690.Solution1();
    }

    @Test
    public void test1() {
        employees = new ArrayList(Arrays.asList(
                new Employee(1, 5, Arrays.asList(2,3)),
                new Employee(2, 3, Arrays.asList()),
                new Employee(3, 3, Arrays.asList())));
        id = 1;
        assertEquals(11, solution1.getImportance(employees, id));
    }

    @Test
    public void test2() {
        employees = new ArrayList(Arrays.asList(
                new Employee(1, 5, Arrays.asList(2,3)),
                new Employee(2, 3, Arrays.asList(4)),
                new Employee(3, 4, Arrays.asList()),
                new Employee(4, 1, Arrays.asList())));
        id = 1;
        assertEquals(13, solution1.getImportance(employees, id));
    }

}