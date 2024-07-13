package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _2751 {
    public static class Solution1 {
        /**
         * My completely original solution.
         */
        public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
            List<Robot> list = new ArrayList<>();
            for (int i = 0; i < positions.length; i++) {
                list.add(new Robot(positions[i], healths[i], directions.charAt(i), i));
            }
            Collections.sort(list, (a, b) -> a.position - b.position);
            Deque<Robot> stack = new LinkedList<>();
            for (int i = 0; i < list.size(); i++) {
                Robot curr = list.get(i);
                if (stack.isEmpty() || curr.direction == 'R') {
                    stack.addLast(curr);
                } else if (curr.direction == 'L') {
                    if (stack.peekLast().direction == 'R') {
                        Robot last = stack.pollLast();
                        if (last.health == curr.health) {
                            curr.health = 0;
                        } else if (last.health < curr.health) {
                            curr.health--;
                            if (!stack.isEmpty() && stack.peekLast().direction == 'R') {
                                while (!stack.isEmpty() && stack.peekLast().direction == 'R') {
                                    Robot poll = stack.pollLast();
                                    if (poll.health < curr.health) {
                                        curr.health--;
                                    } else if (poll.health == curr.health) {
                                        curr.health = 0;
                                        break;
                                    } else {
                                        poll.health--;
                                        stack.addLast(poll);
                                        break;
                                    }
                                }
                                if (stack.isEmpty() || stack.peekLast().direction == 'L' && curr.health > 0) {
                                    stack.addLast(curr);
                                }
                            } else {
                                stack.addLast(curr);
                            }
                        } else {
                            last.health--;
                            stack.addLast(last);
                        }
                    } else {
                        stack.addLast(curr);
                    }
                }
            }
            List<Robot> result = new ArrayList<>();
            while (!stack.isEmpty()) {
                result.add(stack.pollLast());
            }
            Collections.sort(result, (a, b) -> a.originalPosition - b.originalPosition);
            List<Integer> finalResult = new ArrayList<>();
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).health > 0) {
                    finalResult.add(result.get(i).health);
                }
            }
            return finalResult;
        }

        class Robot {
            int position;
            int health;
            char direction;
            int originalPosition;

            public Robot(int position, int health, char direction, int originalPosition) {
                this.position = position;
                this.health = health;
                this.direction = direction;
                this.originalPosition = originalPosition;
            }
        }
    }
}
