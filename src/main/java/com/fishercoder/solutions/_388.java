package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.Stack;

public class _388 {
    public static int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack();
        int longestLen = 0, currDirLen = 0;
        int i = 0, currLevel = 0;
        int nextLevel = 0;
        boolean isFile = false;
        Character period = '.', space = ' ';
        while (i < input.length()) {
            currLevel = nextLevel;
            int currStrLen = 0;
            while (i < input.length() && (Character.isLetterOrDigit(input.charAt(i))
                    || period.equals(input.charAt(i)) || space.equals(input.charAt(i)))) {
                if (period.equals(input.charAt(i))) {
                    isFile = true;
                }
                i++;
                currStrLen++;
            }
            if (isFile) {
                longestLen = Math.max(longestLen, currDirLen + currStrLen);
            } else {
                currDirLen += currStrLen + 1;
                stack.push(currStrLen + 1);
            }

            nextLevel = 0;
            i = i + 1;//increment one to let it pass "\n" and start from "\t"
            while (i < input.length() - 1 && input.substring(i, i + 1).equals("\t")) {
                nextLevel++;
                i = i + 1;
            }

            if (nextLevel < currLevel) {
                int j = 0;
                if (isFile) {
                    while (!stack.isEmpty() && j < (currLevel - nextLevel)) {
                        currDirLen -= stack.pop();
                        j++;
                    }
                } else {
                    while (!stack.isEmpty() && j <= (currLevel - nextLevel)) {
                        currDirLen -= stack.pop();
                        j++;
                    }
                }
            } else if (nextLevel == currLevel) {
                if (!isFile && !stack.isEmpty()) {
                    currDirLen -= stack.pop();
                }

            }

            if (nextLevel == 0) {
                currDirLen = 0;
                stack.clear();
            }

            isFile = false;
        }

        return longestLen;
    }


    public static void main(String... strings) {
//        System.out.println(Character.isLetterOrDigit('&'));
//        System.out.println(Character.isLetterOrDigit('\\'));
//        System.out.println(Character.isValidCodePoint('#'));
        String test = "\\t";
//        System.out.println(test.substring(0, 2).equals("\\t"));
//        System.out.print("\n\t");
//        System.out.print("something");
//        String s = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";//correct output should be 32
//        String s = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";//correct output is 20
//        String s = "aaaaaaaaaaaaaaaaaaaaa/sth.png";
//        String s = "a/aa/aaa/file1.txt";
//        String s = "file name with  space.txt";
//        String s = "dir\n    file.txt";
        String s = "dir\n    file.txt";//correct output is 12
//        String s = "a\n\tb1\n\t\tf1.txt\n\taaaaa\n\t\tf2.txt";//correct answer is 14
        printWithIndex(s);
        System.out.println(s);
        System.out.println(lengthLongestPath(s));
//        System.out.println(parse(s));
    }

    private static void printWithIndex(String s) {
        System.out.println("\\n");
        int len = s.length();
        for (int i = 0; i < len; i++) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
        Character slash = '\\', space = ' ', n = 'n', t = 't';
        String newLine = "\\n", newTab = "\\t";
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case '\n':
                    System.out.print("\\" + " " + "n");
                    break;
                case '\t':
                    System.out.print("\\" + " " + "t");
                    break;
                default:
                    System.out.print(s.charAt(i));
            }
            System.out.print("\t");
        }
        System.out.println();
    }


    public static int parse(String input) {
        String[] splits = input.split("\\n");
        CommonUtils.printArray_generic_type(splits);
        int longestLen = 0;
        for (String path : splits) {
            boolean isFile = false;
            int thisLen = 0;
            String[] paths = path.split("\\t");
            CommonUtils.printArray_generic_type(paths);
            if (paths[paths.length - 1].contains(".")) isFile = true;
            if (isFile) {
                for (String eachDir : paths) {
                    thisLen += eachDir.length();
                    thisLen++;//plus the slash sign
                }
                longestLen = Math.max(longestLen, thisLen);
            }
        }
        return longestLen;
    }
}
