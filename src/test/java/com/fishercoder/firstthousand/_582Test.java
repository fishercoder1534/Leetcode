package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._582;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 5/18/17.
 */
public class _582Test {
    private _582.Solution1 solution1;
    private static List<Integer> pid;
    private static List<Integer> ppid;
    private static List<Integer> expected;
    private static Integer kill;

    @BeforeEach
    public void setup() {
        solution1 = new _582.Solution1();
    }

    @Test
    public void test1() {
        pid = Arrays.asList(1, 3, 10, 5);
        ppid = Arrays.asList(3, 0, 5, 3);
        kill = 5;
        expected = Arrays.asList(5, 10);
        assertEquals(expected, solution1.killProcess(pid, ppid, kill));
    }

    @Test
    public void test2() {
        pid = Arrays.asList(1, 3, 10, 5);
        ppid = Arrays.asList(3, 0, 5, 3);
        kill = 3;
        expected = Arrays.asList(3, 1, 5, 10);
        assertEquals(expected, solution1.killProcess(pid, ppid, kill));
    }
}
