package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1600;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1600Test {
    private _1600.Solution1.ThroneInheritance throneInheritance;

    @Test
    public void test1() {
        throneInheritance = new _1600.Solution1.ThroneInheritance("king");
        throneInheritance.birth("king", "andy");
        throneInheritance.birth("king", "bob");
        throneInheritance.birth("king", "catherine");
        throneInheritance.birth("andy", "matthew");
        throneInheritance.birth("bob", "alex");
        throneInheritance.birth("bob", "asha");
        assertEquals(Arrays.asList("king", "andy", "matthew", "bob", "alex", "asha", "catherine"), throneInheritance.getInheritanceOrder());
        throneInheritance.death("bob");
        assertEquals(Arrays.asList("king", "andy", "matthew", "alex", "asha", "catherine"), throneInheritance.getInheritanceOrder());
    }

    @Test
    public void test2() {
        throneInheritance = new _1600.Solution1.ThroneInheritance("king");
        assertEquals(Arrays.asList("king"), throneInheritance.getInheritanceOrder());
        throneInheritance.birth("king", "clyde");
        throneInheritance.birth("clyde", "shannon");
        throneInheritance.birth("shannon", "scott");
        throneInheritance.birth("king", "keith");
        assertEquals(Arrays.asList("king", "clyde", "shannon", "scott", "keith"), throneInheritance.getInheritanceOrder());
        throneInheritance.birth("clyde", "joseph");
        assertEquals(Arrays.asList("king", "clyde", "shannon", "scott", "joseph", "keith"), throneInheritance.getInheritanceOrder());
    }

}
