package com.fishercoder;

import com.fishercoder.solutions._1604;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _1604Test {
    private static _1604.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1604.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("daniel"), solution1.alertNames(new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"}, new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("bob"), solution1.alertNames(new String[]{"alice", "alice", "alice", "bob", "bob", "bob", "bob"}, new String[]{"12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00"}));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(), solution1.alertNames(new String[]{"john", "john", "john"}, new String[]{"23:58", "23:59", "00:01"}));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList("clare", "leslie"), solution1.alertNames(new String[]{"leslie", "leslie", "leslie", "clare", "clare", "clare", "clare"}, new String[]{"13:00", "13:20", "14:00", "18:00", "18:51", "19:30", "19:49"}));
    }

}