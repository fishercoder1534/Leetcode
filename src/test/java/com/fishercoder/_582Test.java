package com.fishercoder;

import com.fishercoder.solutions._582;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/18/17.
 */
public class _582Test {
    private static _582 test;
    private static List<Integer> pid;
    private static List<Integer> ppid;
    private static List<Integer> expected;
    private static Integer kill;

    @BeforeClass
    public static void setup() {
        test = new _582();
    }

    @Test
    public void test1() {
        pid = Arrays.asList(1, 3, 10, 5);
        ppid = Arrays.asList(3, 0, 5, 3);
        kill = 5;
        expected = Arrays.asList(5, 10);
        assertEquals(expected, test.killProcess(pid, ppid, kill));
    }

    @Test
    public void test2() {
        pid = Arrays.asList(1, 3, 10, 5);
        ppid = Arrays.asList(3, 0, 5, 3);
        kill = 3;
        expected = Arrays.asList(3, 1, 5, 10);
        assertEquals(expected, test.killProcess(pid, ppid, kill));
    }
}
