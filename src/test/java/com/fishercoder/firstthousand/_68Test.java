package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._68;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _68Test {
    private _68.Solution1 solution1;
    private static String[] words;

    @BeforeEach
    public void setup() {
        solution1 = new _68.Solution1();
    }

    @Test
    public void test1() {
        words =
                new String[] {
                    "This", "is", "a", "good", "test!", "\n", "What", "do", "you", "\n", "think?",
                    "\n", "I", "think", "so", "too!"
                };
        assertEquals(
                Arrays.asList(
                        "This  is  a good",
                        "test!  \n What do",
                        "you \n think? \n I",
                        "think so too!   "),
                solution1.fullJustify(words, 16));
    }

    @Test
    public void test2() {
        words = new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        assertEquals(
                Arrays.asList("This    is    an", "example  of text", "justification.  "),
                solution1.fullJustify(words, 16));
    }
}
