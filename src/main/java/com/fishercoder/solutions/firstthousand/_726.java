package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _726 {
    public static class Solution1 {
        /*
         * My completely original solution:
         * 1. use a stack;
         * 2. whenever we encounter the open paren, we push it into the top of the stack;
         * 3. whenever we encounter an uppercase, we check to get its full atom letters,
         * then check to get the number after it if there's any, then form a pair objet and push onto the stack;
         * 4. whenever we encounter the closed paren, we check if there's any number after it,
         * then poll all items on top of the stack off onto a new/temp stack until we encounter the corresponding open paren,
         * then add these items from the temp stack back into the original/main stack;
         */
        public String countOfAtoms(String formula) {
            Deque<Pair> stack = new LinkedList<>();
            for (int i = 0; i < formula.length(); i++) {
                char curr = formula.charAt(i);
                if (curr == '(') {
                    stack.addLast(new Pair("(", 1));
                } else if (Character.isUpperCase(curr)) {
                    StringBuilder sb = new StringBuilder(curr + "");
                    i++;
                    while (i < formula.length() && Character.isLowerCase(formula.charAt(i))) {
                        sb.append(formula.charAt(i++));
                    }
                    if (i < formula.length()) {
                        if (Character.isUpperCase(formula.charAt(i))
                                || formula.charAt(i) == '('
                                || formula.charAt(i) == ')') {
                            // no numbers
                            stack.addLast(new Pair(sb.toString(), 1));
                            i--;
                        } else {
                            // there are numbers
                            StringBuilder numberSb = new StringBuilder();
                            while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                                numberSb.append(formula.charAt(i++));
                            }
                            i--;
                            stack.addLast(
                                    new Pair(sb.toString(), Integer.parseInt(numberSb.toString())));
                        }
                    } else {
                        stack.addLast(new Pair(sb.toString(), 1));
                    }
                } else if (curr == ')') {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                        sb.append(formula.charAt(i));
                        i++;
                    }
                    i--;
                    int number = 1;
                    if (sb.length() > 0) {
                        number = Integer.parseInt(sb.toString());
                    }
                    Deque<Pair> stack2 = new LinkedList<>();
                    while (!stack.isEmpty() && !stack.peekLast().atom.equals("(")) {
                        Pair pair = stack.pollLast();
                        stack2.addLast(new Pair(pair.atom, pair.count * number));
                    }
                    stack.pollLast(); // poll "(" off of the stack
                    while (!stack2.isEmpty()) {
                        stack.addLast(stack2.pollLast());
                    }
                }
            }
            List<Pair> list = new ArrayList<>();
            while (!stack.isEmpty()) {
                list.add(stack.pollLast());
            }
            // now merge the same atoms
            Map<String, Integer> map = new HashMap<>();
            for (Pair pair : list) {
                map.put(pair.atom, map.getOrDefault(pair.atom, 0) + pair.count);
            }
            // now add the merged atoms into the list again before sorting them
            list.clear();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                list.add(new Pair(entry.getKey(), entry.getValue()));
            }
            Collections.sort(list, (a, b) -> a.atom.compareToIgnoreCase(b.atom));
            StringBuilder sb = new StringBuilder();
            for (Pair pair : list) {
                sb.append(pair.atom + (pair.count == 1 ? "" : pair.count));
            }
            return sb.toString();
        }

        class Pair {
            String atom;
            int count;

            public Pair(String atom, int count) {
                this.atom = atom;
                this.count = count;
            }
        }
    }
}
