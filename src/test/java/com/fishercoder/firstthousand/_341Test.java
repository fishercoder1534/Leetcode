package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.NestedInteger;
import com.fishercoder.solutions.firstthousand._341;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class _341Test {
  private _341.Solution1 test;
  private static List<NestedInteger> nestedList;

  @BeforeEach
    public void setUp() {
    test = new _341.Solution1();
  }

  @Test
  public void test1() {
    NestedInteger six = new NestedInteger(6);
    List<NestedInteger> sixList = new ArrayList<>();
    sixList.add(six);
    NestedInteger four = new NestedInteger(4);
    List<NestedInteger> fourList = new ArrayList<>();
    fourList.add(four);
    fourList.addAll(sixList);
    NestedInteger one = new NestedInteger(1);
    List<NestedInteger> oneList = new ArrayList<>();
    oneList.add(one);
    oneList.addAll(fourList);
    _341.Solution1.NestedIterator nestedIterator = new _341.Solution1.NestedIterator(oneList);
    assertTrue(nestedIterator.hasNext());
    assertEquals(1, (int) nestedIterator.next());
  }

  @Test
  public void test2() {
    List<NestedInteger> bigList = new ArrayList<>();

    NestedInteger one = new NestedInteger(1);
    NestedInteger two = new NestedInteger(2);
    List<NestedInteger> oneList = new ArrayList<>();
    oneList.add(one);
    oneList.add(two);
    NestedInteger oneNestedInteger = new NestedInteger(oneList);
    bigList.add(oneNestedInteger);

    NestedInteger three = new NestedInteger(3);
    bigList.add(three);

    NestedInteger four = new NestedInteger(4);
    NestedInteger five = new NestedInteger(5);
    List<NestedInteger> threeList = new ArrayList<>();
    threeList.add(four);
    threeList.add(five);
    NestedInteger threeNestedInteger = new NestedInteger(threeList);
    bigList.add(threeNestedInteger);

    _341.Solution1.NestedIterator nestedIterator = new _341.Solution1.NestedIterator(bigList);
    assertTrue(nestedIterator.hasNext());
    assertEquals(1, (int) nestedIterator.next());
  }
}
