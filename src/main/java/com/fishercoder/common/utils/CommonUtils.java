package com.fishercoder.common.utils;

import com.fishercoder.common.classes.Interval;
import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonUtils {

    private static final int DEFAULT_TREE_SIZE = 10;
    private static final int DEFAULT_UPPER_BOUND = 100;

    //How to make a method generic: declare <T> in its method signature
    public static <T> void printArray_generic_type(T[] nums) {
        for (T i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String... strings) {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};
        printArray_generic_type(nums);
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void print2DIntArray(int[][] nums) {
        for (int[] array : nums) {
            for (int i : array) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static void print(int num) {
        System.out.print(num);
    }

    public static void print(List<String> list) {
        System.out.println("----------------------------------------------------");
        for (String str : list) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void println(int num) {
        System.out.println(num);
    }

    public static void println() {
        System.out.println();
    }

    // overloaded method to take only one argument
    public static List<Integer> randomIntArrayGenerator(int size) {
        return CommonUtils.randomIntArrayGenerator(size, DEFAULT_UPPER_BOUND);
    }

    // overloaded method to take no argument
    public static List<Integer> randomIntArrayGenerator() {
        return CommonUtils.randomIntArrayGenerator(CommonUtils.DEFAULT_TREE_SIZE,
                DEFAULT_UPPER_BOUND);
    }

    // this one has two other overloaded methods as above
    public static List<Integer> randomIntArrayGenerator(int size, int upperBound) {
        List<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomInt = random.nextInt(upperBound);
            result.add(randomInt);
            print(String.valueOf(randomInt) + " ");
        }
        println();
        return result;
    }

    // this one has two other overloaded methods as above
    public static List<Integer> uniqueIntArrayGenerator(int size) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            result.add(i);
        }
        println();
        return result;
    }

    // @Notes(context =
    // "I'm assuing only classes in this PACKAGE will call the following two methods, so just leave the modifier as default, i.e. no public, private, or protected.")
    public static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }

    /**
     * If you want to print the reversed list out, you need to return the reversed list's head,
     * which was the end node of the original node. using the following function.
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous;
        ListNode current;
        ListNode next;
        previous = head;
        current = head.next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head.next = null;
        return previous;
    }

    public static void printList(final ListNode head) {
        ListNode temp = head;
        System.out.println("--------------------------------------------");
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public static <T> void printList(List<T> list) {
        int count = 0;
        for (T t : list) {
            count++;
            System.out.print(t);
            if (count % 10 != 0) {
                System.out.print("\t");
            } else {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public static void printMatrixGeneric(boolean[][] matrix) {

        System.out.println("Matrix is: ");
        for (boolean[] row : matrix) {
            for (boolean t : row) {
                System.out.print(t + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");

    }

    public static <T> void printListList(List<List<T>> res) {
        for (List<T> list : res) {
            for (T i : list) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    public static void printIntervals(List<Interval> intervals) {
        for (Interval interval : intervals) {
            System.out.print("[" + interval.start + ", " + interval.end + "], ");
        }
        System.out.println();
    }

    public static void printArrayArray(int[][] arrayArrays) {
        for (int[] array : arrayArrays) {
            for (int i : array) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print2DCharArray(char[][] arrayArrays) {
        for (char[] array : arrayArrays) {
            for (char i : array) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
