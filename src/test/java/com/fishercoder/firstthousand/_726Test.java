package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._726;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _726Test {
    private _726.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _726.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("H2O", solution1.countOfAtoms("H2O"));
    }

    @Test
    public void test2() {
        assertEquals("H2MgO2", solution1.countOfAtoms("Mg(OH)2"));
    }

    @Test
    public void test3() {
        assertEquals("K4N2O14S4", solution1.countOfAtoms("K4(ON(SO3)2)2"));
    }

    @Test
    public void test4() {
        assertEquals("H2MgNO", solution1.countOfAtoms("Mg(H2O)N"));
    }
}
