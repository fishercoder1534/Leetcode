package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2451;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2451Test {
    private static _2451.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2451.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("abc", solution1.oddString(new String[]{"adc", "wzy", "abc"}));
    }

    @Test
    public void test2() {
        assertEquals("aaaabbbbbbaaabaaaabb", solution1.oddString(new String[]{"nnnmmmnnmmmmmmmmmmnm", "iiihhhiihhhhhhhhhhih", "aaaabbbbbbaaabaaaabb", "qqqpppqqppppppppppqp", "eeedddeedddddddddded", "eeedddeedddddddddded", "iiihhhiihhhhhhhhhhih", "lllkkkllkkkkkkkkkklk", "sssrrrssrrrrrrrrrrsr", "sssrrrssrrrrrrrrrrsr", "jjjiiijjiiiiiiiiiiji", "nnnmmmnnmmmmmmmmmmnm", "xxxwwwxxwwwwwwwwwwxw", "eeedddeedddddddddded", "zzzyyyzzyyyyyyyyyyzy", "wwwvvvwwvvvvvvvvvvwv", "cccbbbccbbbbbbbbbbcb", "xxxwwwxxwwwwwwwwwwxw", "cccbbbccbbbbbbbbbbcb", "yyyxxxyyxxxxxxxxxxyx", "hhhggghhgggggggggghg"}));
    }

    @Test
    public void test3() {
        assertEquals("abb", solution1.oddString(new String[]{"mll", "abb", "edd", "jii", "tss", "fee", "dcc", "nmm", "utt", "zyy", "xww", "tss", "wvv", "xww", "utt"}));
    }

}