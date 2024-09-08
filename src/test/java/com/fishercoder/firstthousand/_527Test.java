package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._527;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _527Test {

    private _527.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _527.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.asList(
                        "l2e",
                        "god",
                        "internal",
                        "me",
                        "i6t",
                        "interval",
                        "inte4n",
                        "f2e",
                        "intr4n"),
                solution1.wordsAbbreviation(
                        Arrays.asList(
                                "like",
                                "god",
                                "internal",
                                "me",
                                "internet",
                                "interval",
                                "intension",
                                "face",
                                "intrusion")));
    }
}
