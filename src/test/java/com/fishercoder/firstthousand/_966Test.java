package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._966;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by varunu28 on 1/01/19. */
public class _966Test {
    private _966.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _966.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.toString(
                        new String[] {
                            "kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"
                        }),
                Arrays.toString(
                        solution1.spellchecker(
                                new String[] {"KiTe", "kite", "hare", "Hare"},
                                new String[] {
                                    "kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti",
                                    "keet", "keto"
                                })));
    }
}
