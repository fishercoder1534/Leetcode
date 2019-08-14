package com.fishercoder;

import com.fishercoder.solutions._635;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by fishercoder on 9/9/17.
 */
public class _635Test {
    private static _635.Solution1.LogSystem logSystem;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup() {
        logSystem = new _635.Solution1.LogSystem();
    }

    @Before
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
        assertEquals(expected, logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"));
    }

    @Test
    public void test2() {
        logSystem.put(1, "2017:01:01:23:59:59");
        logSystem.put(2, "2017:01:01:22:59:59");
        logSystem.put(3, "2016:01:01:00:00:00");
        expected = Arrays.asList(1, 2);
        assertEquals(expected, logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"));
    }

}
