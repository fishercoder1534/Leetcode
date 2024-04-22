package com.fishercoder;

import com.fishercoder.solutions._1257;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1257Test {
    private static _1257.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1257.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("North America", solution1.findSmallestRegion(
                Arrays.asList(Arrays.asList("Earth", "North America", "South America"),
                        Arrays.asList("North America", "United States", "Canada"),
                        Arrays.asList("United States", "New York", "Boston"),
                        Arrays.asList("Canada", "Ontario", "Quebec"),
                        Arrays.asList("South America", "Brazil")), "Quebec", "New York"));
    }

    @Test
    public void test2() {
        assertEquals("Canada", solution1.findSmallestRegion(
                Arrays.asList(Arrays.asList("Earth", "North America", "South America"),
                        Arrays.asList("North America", "United States", "Canada"),
                        Arrays.asList("United States", "New York", "Boston"),
                        Arrays.asList("Canada", "Ontario", "Quebec"),
                        Arrays.asList("South America", "Brazil")),
                "Canada", "Quebec"));
    }

    @Test
    public void test3() {
        assertEquals("Earth", solution1.findSmallestRegion(
                Arrays.asList(Arrays.asList("Earth", "North America", "South America"),
                        Arrays.asList("North America", "United States", "Canada"),
                        Arrays.asList("United States", "New York", "Boston"),
                        Arrays.asList("Canada", "Ontario", "Quebec"),
                        Arrays.asList("South America", "Brazil")),
                "Canada", "South America"));
    }

    @Test
    public void test4() {
        assertEquals("GfAj", solution1.findSmallestRegion(
                Arrays.asList(Arrays.asList("zDkA", "GfAj", "lt"),
                        Arrays.asList("GfAj", "rtupD", "og", "l"),
                        Arrays.asList("rtupD", "IT", "jGcew", "ZwFqF"),
                        Arrays.asList("og", "yVobt", "EjA", "piUyQ"),
                        Arrays.asList("IT", "XFlc", "W", "rB"),
                        Arrays.asList("l", "GwQg", "shco", "Dub", "KwgZq"),
                        Arrays.asList("jGcew", "KH", "lbW"),
                        Arrays.asList("KH", "BZ", "sauG"),
                        Arrays.asList("sNyV", "WbrP"),
                        Arrays.asList("oXMG", "uqe"),
                        Arrays.asList("ALlyw", "jguyA", "Mi"),
                        Arrays.asList("PnGPY", "Ev", "lI"),
                        Arrays.asList("wmYF", "xreBK"),
                        Arrays.asList("x", "dclJ"),
                        Arrays.asList("JyOSt", "i"),
                        Arrays.asList("yEH", "UY", "GIwLp"),
                        Arrays.asList("lbW", "M"),
                        Arrays.asList("th", "JyOSt", "ALlyw"),
                        Arrays.asList("ZwFqF", "GDl"),
                        Arrays.asList("Zqk", "th"),
                        Arrays.asList("Aa", "wmYF"),
                        Arrays.asList("nQ", "IOw"),
                        Arrays.asList("oGg", "x"),
                        Arrays.asList("pLGYN", "ldb"),
                        Arrays.asList("XjpeC", "vK", "aaO", "D"),
                        Arrays.asList("a", "TekG", "zp"),
                        Arrays.asList("Dub", "PnGPY"),
                        Arrays.asList("SOvB", "iD", "pLGYN", "Zqk"),
                        Arrays.asList("bmFhM", "SOvB", "RWsEM", "z"),
                        Arrays.asList("SAH", "bmFhM"),
                        Arrays.asList("GEs", "oXMG", "tNJYJ"),
                        Arrays.asList("zh", "PWeEf"),
                        Arrays.asList("Mfb", "GEs", "XjpeC", "p"),
                        Arrays.asList("Sn", "rVIh", "twv", "pYA", "Ywm"),
                        Arrays.asList("piUyQ", "G", "aTi"),
                        Arrays.asList("If", "e", "y", "quEA", "sNyV"),
                        Arrays.asList("XFlc", "Sn", "ftXOZ"),
                        Arrays.asList("lt", "Q", "fWB", "a", "Wk", "zpqU"),
                        Arrays.asList("xsUkW", "Cssa", "TgPi", "qx"),
                        Arrays.asList("sauG", "If", "nK", "HHOr", "yEH", "YWMgF"),
                        Arrays.asList("shco", "xsUkW"),
                        Arrays.asList("GwQg", "Mfb", "gr", "S", "nQ"),
                        Arrays.asList("v", "SAH", "Rjr"),
                        Arrays.asList("BZ", "v", "zh", "oGg", "WP"),
                        Arrays.asList("yVobt", "Aa", "lJRmv")
                ),
                "RWsEM", "GfAj"));
    }

}
