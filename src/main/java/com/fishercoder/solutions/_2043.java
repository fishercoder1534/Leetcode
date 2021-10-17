package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _2043 {
    public static class Solution1 {
        class Bank {

            List<Long> list;

            public Bank(long[] balance) {
                list = new ArrayList<>();
                for (long b : balance) {
                    list.add(b);
                }
            }

            public boolean transfer(int account1, int account2, long money) {
                if (account1 - 1 >= list.size()) {
                    return false;
                } else if (list.get(account1 - 1) < money) {
                    return false;
                } else if (account2 - 1 >= list.size()) {
                    return false;
                } else {
                    Long original = list.remove(account1 - 1);
                    list.add(account1 - 1, original - money);
                    Long remove = list.remove(account2 - 1);
                    list.add(account2 - 1, remove + money);
                    return true;
                }
            }

            public boolean deposit(int account, long money) {
                if (account - 1 >= list.size()) {
                    return false;
                } else {
                    Long original = list.remove(account - 1);
                    list.add(account - 1, original + money);
                    return true;
                }
            }

            public boolean withdraw(int account, long money) {
                if (account - 1 >= list.size()) {
                    return false;
                } else if (list.get(account - 1) < money) {
                    return false;
                } else {
                    Long original = list.remove(account - 1);
                    list.add(account - 1, original - money);
                    return true;
                }
            }
        }

    }
}
