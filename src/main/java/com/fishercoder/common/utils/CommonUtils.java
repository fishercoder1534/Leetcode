package com.fishercoder.common.utils;

import com.fishercoder.common.classes.Interval;
import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.Deque;
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
        String input1 = "[\"zDkA\",\"GfAj\",\"lt\"],[\"GfAj\",\"rtupD\",\"og\",\"l\"],[\"rtupD\",\"IT\",\"jGcew\",\"ZwFqF\"],[\"og\",\"yVobt\",\"EjA\",\"piUyQ\"],[\"IT\",\"XFlc\",\"W\",\"rB\"],[\"l\",\"GwQg\",\"shco\",\"Dub\",\"KwgZq\"],[\"oXMG\",\"uqe\"],[\"sNyV\",\"WbrP\"]";
        String input2 = "[\"A\",\"B\"],[\"C\"],[\"B\",\"C\"],[\"D\"]";
        CommonUtils.printListList(convertLeetCode2DStringArrayInputIntoJavaArray(input1));
        CommonUtils.printListList(convertLeetCode2DStringArrayInputIntoJavaArray(input2));
        CommonUtils.print(convertLeetCode1DStringArrayInputIntoJavaArray("[\"abcsi\",\"abyzjgj\",\"advz\",\"ag\",\"agkgdkob\",\"agpr\",\"ail\"]"));
        CommonUtils.print2DIntArray(convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[448,931,123,345],[889],[214,962],[576,746,897]"));
    }

    public static void printArray(boolean[] booleans) {
        for (boolean i : booleans) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printArray(double[] booleans) {
        for (double i : booleans) {
            System.out.print(i + ", ");
        }
        System.out.println();
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
        System.out.println("\n--------------------------------------------");
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

    public static <T> void printDeque(Deque<T> deque) {
        int count = 0;
        for (T t : deque) {
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

    public static char[][] convertLeetCodeRegular2DCharArrayInputIntoJavaArray(String input) {
/**LeetCode 2-d char array usually comes in like this:
 * ["#"," ","#"],[" "," ","#"],["#","c"," "] which is wrapped in double quotes instead of single quotes which makes it not usable in Java code.
 * This method helps with the conversion.*/
        String[] arrays = input.split("],\\[");
//        CommonUtils.printArray_generic_type(arrays);
        int m = arrays.length;
        int n = arrays[1].split(",").length;
        char[][] ans = new char[m][n];
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                String str = arrays[i].substring(1);
                String[] strs = str.split(",");
                for (int j = 0; j < strs.length; j++) {
                    ans[i][j] = strs[j].charAt(1);
                }
            } else if (i == m - 1) {
                String str = arrays[i].substring(0, arrays[i].length() - 1);
                String[] strs = str.split(",");
                for (int j = 0; j < strs.length; j++) {
                    ans[i][j] = strs[j].charAt(1);
                }
            } else {
                String[] strs = arrays[i].split(",");
                for (int j = 0; j < strs.length; j++) {
                    ans[i][j] = strs[j].charAt(1);
                }
            }
        }
        return ans;
    }

    public static int[][] convertLeetCodeRegularRectangleArrayInputIntoJavaArray(String input) {
        /**
         * LeetCode 2-d array input usually comes like this: it's a REGULAR rectangle
         * [[448,931],[234,889],[214,962],[576,746]]
         * The expected input for this method is: "[448,931],[234,889],[214,962],[576,746]"
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        String[] arrays = input.split("],\\[");
//        CommonUtils.printArray_generic_type(arrays);
        int size = arrays[1].split(",").length;
        int[][] output = new int[arrays.length][size];
        for (int i = 0; i < arrays.length; i++) {
            if (i == 0) {
                String str = arrays[i].substring(1);
                String[] nums = str.split(",");
                for (int j = 0; j < nums.length; j++) {
                    output[i][j] = Integer.parseInt(nums[j]);
                }
            } else if (i == arrays.length - 1) {
                String str = arrays[i].substring(0, arrays[i].length() - 1);
                String[] nums = str.split(",");
                for (int j = 0; j < nums.length; j++) {
                    output[i][j] = Integer.parseInt(nums[j]);
                }
            } else {
                String[] nums = arrays[i].split(",");
                for (int j = 0; j < nums.length; j++) {
                    output[i][j] = Integer.parseInt(nums[j]);
                }
            }
        }
//        CommonUtils.print2DIntArray(output);
        return output;
    }

    public static int[][] convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(String input) {
        /**
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * [[448,931,123,345],[889],[214,962],[576,746,897]]
         * The expected input for this method is: "[448,931,123,345],[889],[214,962],[576,746,897]"
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        String[] arrays = input.split("],\\[");
        int maxLen = 0;
        int[] sizes = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            String[] strs = arrays[i].split(",");
            maxLen = Math.max(maxLen, strs.length);
            sizes[i] = strs.length;
        }
        int[][] output = new int[arrays.length][];
        if (arrays.length == 1) {
            String str = arrays[0].substring(1, arrays[0].length() - 1);
            String[] nums = str.split(",");
            output[0] = new int[sizes[0]];
            for (int j = 0; j < sizes[0]; j++) {
                output[0][j] = Integer.parseInt(nums[j]);
            }
        } else {
            for (int i = 0; i < arrays.length; i++) {
                if (i == 0) {
                    String str = arrays[i].substring(1);
                    String[] nums = str.split(",");
                    output[i] = new int[sizes[i]];
                    for (int j = 0; j < sizes[i]; j++) {
                        output[i][j] = Integer.parseInt(nums[j]);
                    }
                } else if (i == arrays.length - 1) {
                    String str = arrays[i].substring(0, arrays[i].length() - 1);
                    String[] nums = str.split(",");
                    output[i] = new int[sizes[i]];
                    for (int j = 0; j < sizes[i]; j++) {
                        output[i][j] = Integer.parseInt(nums[j]);
                    }
                } else {
                    String[] nums = arrays[i].split(",");
                    output[i] = new int[sizes[i]];
                    for (int j = 0; j < sizes[i]; j++) {
                        output[i][j] = Integer.parseInt(nums[j]);
                    }
                }
            }
        }
        return output;
    }

    public static List<List<String>> convertLeetCode2DStringArrayInputIntoJavaArray(String input) {
        /**
         * How to copy LeetCode 2-d String array into this method:
         * 1. remove the beginning and ending quotes;
         * 2. put double quotes into this method parameter;
         * 3. copy the input into the double quotes.
         *
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * [["A","B"],["C"],["B","C"],["D"]]
         * The expected input for this method is: "[\"A\",\"B\"],[\"C\"],[\"B\",\"C\"],[\"D\"]"
         * just copy the LeetCode input: ["A","B"],["C"],["B","C"],["D"] into double quotes in Java,
         * it'll auto escape the double quotes.
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        String[] arrays = input.split("],\\[");
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            List<String> level = new ArrayList<>();
            String[] strings;
            if (i == 0) {
                strings = arrays[i].substring(1).split(",");
            } else if (i == arrays.length - 1) {
                strings = arrays[i].substring(0, arrays[i].length() - 1).split(",");
            } else {
                strings = arrays[i].split(",");
            }
            for (int j = 0; j < strings.length; j++) {
                level.add(strings[j]);
            }
            result.add(level);
        }
        return result;
    }

    public static List<String> convertLeetCode1DStringArrayInputIntoJavaArray(String input) {
        /**
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * ["A","B","C"]
         * The expected input for this method is: "[\"A\",\"B\",\"C\"]"
         * just copy the LeetCode input: ["A","B","C"] into double quotes in Java,
         * it'll auto escape the double quotes.
         * The output of this method will be a standard Java 1-d array.
         * */
        String[] arrays = input.split(",");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            String word;
            if (i == 0) {
                word = arrays[i].substring(1);
            } else if (i == arrays.length - 1) {
                word = arrays[i].substring(0, arrays[i].length() - 1);
            } else {
                word = arrays[i];
            }
            result.add(word);
        }
        return result;
    }
}
