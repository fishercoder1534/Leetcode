package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._362;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _362Test {
    private _362.Solution1.HitCounter hitCounter;

    @BeforeEach
    public void setup() {
        hitCounter = new _362.Solution1.HitCounter();
    }

    @Test
    public void test1() {
        hitCounter.hit(1);
        hitCounter.hit(2);
        hitCounter.hit(3);
        assertEquals(3, hitCounter.getHits(4));

        hitCounter.hit(300);
        assertEquals(4, hitCounter.getHits(300));
        assertEquals(3, hitCounter.getHits(301));

        hitCounter.hit(301);
        assertEquals(4, hitCounter.getHits(300));
    }
}
