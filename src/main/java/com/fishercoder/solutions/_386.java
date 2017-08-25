package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Given an integer n, return 1 - n in lexicographical order.

For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].

Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.*/
public class _386 {
    //Radix sort doesn't apply here! Don't confuse myself!
    
    //rewrote their solution from Python to Java:https://discuss.leetcode.com/topic/54986/python-memory-limit-exceeded-for-problem-386/17
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList();
        int i = 1;
        while (true) {
            result.add(i);
            if (i * 10 <= n) {
                i *= 10;
            } else {
                while (i % 10 == 9 || i == n) {
                    i /= 10;
                }
                if (i == 0) {
                    return result;
                }
                i++;
            }
        }
    }

    //someone on Discuss hinted that you could use recursion to solve it in Java
    //then I wrote the following method, eventually, got all test cases produce the right output, but unfortunately TLE'ed by OJ
    public static List<Integer> lexicalOrder_LTE_by_10458(int n) {
        List<Integer> result = new ArrayList();
        int insertPosition = 0;
        return addNumbers(result, 1, insertPosition, n);
    }

    private static List<Integer> addNumbers(List<Integer> result, int insertNumber, int insertPosition, int n) {
        int i;
        for (i = 0; i < 9; i++) {
            if (insertNumber + i > n) {
                return result;
            }
            result.add(insertPosition + i, insertNumber + i);
            if ((insertNumber + i) % 10 == 0 && (insertNumber + i) == (insertNumber + 10)) {
                break;
            }
        }
        while ((insertNumber + i) % 10 != 0 && (insertNumber + i) <= n) {
            result.add(insertPosition + i, insertNumber + i);
            i++;
        }
        //find next insert position:
        insertPosition = result.indexOf((insertNumber + i) / 10);
        return addNumbers(result, insertNumber + i, insertPosition + 1, n);
    }

    public static void main(String... strings) {
        long lStartTime = new Date().getTime();

//      CommonUtils.printList(lexicalOrder_TLE_by_23489(23489));
//        List<Integer> result = lexicalOrder(1);//right
//        List<Integer> result = lexicalOrder(13);//right
//        List<Integer> result = lexicalOrder_LTE_by_10458(58);
//        List<Integer> result = lexicalOrder(120);//right  
//        List<Integer> result = lexicalOrder(1200);
//        List<Integer> result = lexicalOrder(10);
//        List<Integer> result = lexicalOrder(5000000);
//        List<Integer> result = lexicalOrder_LTE_by_10458(50000);//this can finish in 183 ms
        List<Integer> result = lexicalOrder_LTE_by_10458(500000);
//        List<Integer> result = lexicalOrder_LTE_by_10458(14959);
        long lEndTime = new Date().getTime();
        long difference = lEndTime - lStartTime;
        System.out.println("Elapsed milliseconds: " + difference);
        System.out.println("result size is: " + result.size());
//        CommonUtils.printList(result);
    }

    /**
     * The most naive way is to generate this list, sort it using a customized comparator and then return it.
     * Unfortunately, this results in TLE with this input: 23489
     */
    public static List<Integer> lexicalOrder_TLE_by_23489(int n) {
        List<Integer> result = new ArrayList();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                return s1.compareTo(s2);
            }
        });
        return result;
    }

}
