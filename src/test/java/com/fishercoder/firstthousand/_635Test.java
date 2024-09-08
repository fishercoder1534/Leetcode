package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._635;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 9/9/17. */
public class _635Test {
    private _635.Solution1.LogSystem logSystem;
    private static List<Integer> expected;

    @BeforeEach
    public void setup() {
        logSystem = new _635.Solution1.LogSystem();
    }

    @BeforeEach
    public void clear() {
        logSystem = new _635.Solution1.LogSystem();
        expected = new ArrayList<>();
    }

    @Test
    public void test1() {
        logSystem.put(1, "2017:01:01:23:59:59");
        logSystem.put(2, "2017:01:01:22:59:59");
        logSystem.put(3, "2016:01:01:00:00:00");
        expected = Arrays.asList(1, 2, 3);
        assertEquals(
                expected, logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"));
    }

    @Test
    public void test2() {
        logSystem.put(1, "2017:01:01:23:59:59");
        logSystem.put(2, "2017:01:01:22:59:59");
        logSystem.put(3, "2016:01:01:00:00:00");
        expected = Arrays.asList(1, 2);
        assertEquals(
                expected, logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"));
    }
}
