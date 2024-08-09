package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1324;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1324Test {
    private _1324.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1324.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("HAY", "ORO", "WEU"), solution1.printVertically("HOW ARE YOU"));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("TBONTB", "OEROOE", "   T"), solution1.printVertically("TO BE OR NOT TO BE"));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("CIC", "OSO", "N M", "T I", "E N", "S G", "T"), solution1.printVertically("CONTEST IS COMING"));
    }

}
