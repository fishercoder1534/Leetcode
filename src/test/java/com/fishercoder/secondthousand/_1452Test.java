package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1452;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1452Test {
    private _1452.Solution1 solution1;
    private static List<List<String>> favoriteCompanies;

    @BeforeEach
    public void setup() {
        solution1 = new _1452.Solution1();
    }

    @Test
    public void test1() {
        favoriteCompanies = new ArrayList<>();
        favoriteCompanies.add(Arrays.asList("leetcode", "google", "facebook"));
        favoriteCompanies.add(Arrays.asList("google", "microsoft"));
        favoriteCompanies.add(Arrays.asList("google", "facebook"));
        favoriteCompanies.add(Arrays.asList("google"));
        favoriteCompanies.add(Arrays.asList("amazon"));
        assertEquals(Arrays.asList(0, 1, 4), solution1.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void test2() {
        favoriteCompanies = new ArrayList<>();
        favoriteCompanies.add(Arrays.asList("nxaqhyoprhlhvhyojanr", "ovqdyfqmlpxapbjwtssm", "qmsbphxzmnvflrwyvxlc", "udfuxjdxkxwqnqvgjjsp", "yawoixzhsdkaaauramvg", "zycidpyopumzgdpamnty"));//6
        favoriteCompanies.add(Arrays.asList("nxaqhyoprhlhvhyojanr", "ovqdyfqmlpxapbjwtssm", "udfuxjdxkxwqnqvgjjsp", "yawoixzhsdkaaauramvg", "zycidpyopumzgdpamnty"));//5
        favoriteCompanies.add(Arrays.asList("ovqdyfqmlpxapbjwtssm", "qmsbphxzmnvflrwyvxlc", "udfuxjdxkxwqnqvgjjsp", "yawoixzhsdkaaauramvg", "zycidpyopumzgdpamnty"));//5
        assertEquals(Arrays.asList(0), solution1.peopleIndexes(favoriteCompanies));
    }

}