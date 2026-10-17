package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3582;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3582Test {
    private _3582.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3582.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", solution1.generateTag("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
    }

    @Test
    public void test2() {
        assertEquals("#fpysartlqlimkvvrhmkkdlnedqkffpncjbitbtovhovjikbfsawvpisdanzxjctqkn", solution1.generateTag(" fPysaRtLQLiMKVvRhMkkDLNedQKffPnCjbITBTOVhoVjiKbfSawvpisDaNzXJctQkn"));
    }

}
