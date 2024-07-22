package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2115;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2115Test {
    private static _2115.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2115.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("bread"),
                solution1.findAllRecipes(new String[]{"bread"},
                        Arrays.asList(Arrays.asList("yeast", "flour")),
                        new String[]{"yeast", "flour", "corn"}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("bread", "sandwich"),
                solution1.findAllRecipes(new String[]{"bread", "sandwich"},
                        Arrays.asList(Arrays.asList("yeast", "flour"), Arrays.asList("bread", "meat")),
                        new String[]{"yeast", "flour", "corn"}));
    }

}
