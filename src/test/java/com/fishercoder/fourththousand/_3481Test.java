package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3481;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3481Test {
    private _3481.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3481.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                "abc_def",
                solution1.applySubstitutions(
                        Arrays.asList(Arrays.asList("A", "abc"), Arrays.asList("B", "def")), "%A%_%B%"));
    }

    @Test
    public void test2() {
        assertEquals(
                "bce_ace_abcace",
                solution1.applySubstitutions(
                        Arrays.asList(Arrays.asList("A", "bce"), Arrays.asList("B", "ace"), Arrays.asList("C", "abc%B%")), "%A%_%B%_%C%"));
    }

    @Test
    public void test3() {
        assertEquals(
                "ydqs_etiwydqsio_etiwydqsi",
                solution1.applySubstitutions(
                        Arrays.asList(Arrays.asList("T", "%P%o"), Arrays.asList("P", "etiw%F%i"), Arrays.asList("F", "ydqs")), "%F%_%T%_%P%"));
    }
}
