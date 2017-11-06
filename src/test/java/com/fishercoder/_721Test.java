package com.fishercoder;

import com.fishercoder.solutions._721;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _721Test {
    private static _721.Solution1 solution1;
    private static _721.Solution2 solution2;
    private static List<List<String>> accounts;
    private static List<List<String>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _721.Solution1();
        solution2 = new _721.Solution2();
    }

    @Test
    public void test1() throws Exception {
        accounts = new ArrayList<>();
        List<String> account1 = new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        List<String> account2 = new ArrayList<>(Arrays.asList("John", "johnnybravo@mail.com"));
        List<String> account3 = new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        List<String> account4 = new ArrayList<>(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);

        expected = new ArrayList<>();
        List<String> expected1 = new ArrayList<>(Arrays.asList("Mary", "mary@mail.com"));
        List<String> expected2 = new ArrayList<>(Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"));
        List<String> expected3 = new ArrayList<>(Arrays.asList("John", "johnnybravo@mail.com"));
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);

        assertEqualsIgnoreOrdering(expected, solution1.accountsMerge(accounts));
        assertEqualsIgnoreOrdering(expected, solution2.accountsMerge(accounts));
    }

    private void assertEqualsIgnoreOrdering(List<List<String>> expected, List<List<String>> actual) throws Exception {
        //TODO: implement this method
        if (true) {
            return;
        } else {
            throw new Exception();
        }
    }

    @Test
    public void test2() throws Exception {
        accounts = new ArrayList<>();
        List<String> account1 = new ArrayList<>(Arrays.asList("Alex", "Alex5@m.co", "Alex4@m.co", "Alex0@m.co"));
        List<String> account2 = new ArrayList<>(Arrays.asList("Ethan", "Ethan3@m.co", "Ethan3@m.co", "Ethan0@m.co"));
        List<String> account3 = new ArrayList<>(Arrays.asList("Kevin", "Kevin4@m.co", "Kevin2@m.co", "Kevin2@m.co"));
        List<String> account4 = new ArrayList<>(Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe2@m.co"));
        List<String> account5 = new ArrayList<>(Arrays.asList("Gabe", "Gabe3@m.co", "Gabe4@m.co", "Gabe2@m.co"));
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        expected = new ArrayList<>();
        List<String> expected1 = new ArrayList<>(Arrays.asList("Alex", "Alex0@m.co", "Alex4@m.co", "Alex5@m.co"));
        List<String> expected2 = new ArrayList<>(Arrays.asList("Kevin", "Kevin2@m.co", "Kevin4@m.co"));
        List<String> expected3 = new ArrayList<>(Arrays.asList("Ethan", "Ethan0@m.co", "Ethan3@m.co"));
        List<String> expected4 = new ArrayList<>(Arrays.asList("Gabe", "Gabe0@m.co", "Gabe2@m.co", "Gabe3@m.co", "Gabe4@m.co"));
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);
        expected.add(expected4);

        assertEqualsIgnoreOrdering(expected, solution1.accountsMerge(accounts));
        assertEqualsIgnoreOrdering(expected, solution2.accountsMerge(accounts));
    }

    @Test
    public void test3() throws Exception {
        accounts = new ArrayList<>();
        List<String> account1 = new ArrayList<>(Arrays.asList("David", "David0@m.co", "David1@m.co"));
        List<String> account2 = new ArrayList<>(Arrays.asList("David", "David3@m.co", "David4@m.co"));
        List<String> account3 = new ArrayList<>(Arrays.asList("David", "David4@m.co", "David5@m.co"));
        List<String> account4 = new ArrayList<>(Arrays.asList("David", "David2@m.co", "David3@m.co"));
        List<String> account5 = new ArrayList<>(Arrays.asList("David", "David1@m.co", "David2@m.co"));
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        expected = new ArrayList<>();
        List<String> expected1 = new ArrayList<>(Arrays.asList("David", "David0@m.co", "David1@m.co", "David2@m.co", "David3@m.co", "David4@m.co", "David5@m.co"));
        expected.add(expected1);

        assertEqualsIgnoreOrdering(expected, solution1.accountsMerge(accounts));
        assertEqualsIgnoreOrdering(expected, solution2.accountsMerge(accounts));
    }

}
