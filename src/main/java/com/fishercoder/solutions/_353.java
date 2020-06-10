package com.fishercoder.solutions;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _353 {
    public class SnakeGame {
        private Set<Integer> set;//Use a set to hold all occupied points for the snake body, this is for easy access for the case of eating its own body
        private Deque<Integer> body;//use a queue to hold all occupied points for the snake body as well, this is for easy access to update the tail
        int[][] food;
        int score;
        int foodIndex;
        int width;
        int height;

        /**
         * Initialize your data structure here.
         *
         * @param width  - screen width
         * @param height - screen height
         * @param food   - A list of food positions
         *               E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0].
         */
        public SnakeGame(int width, int height, int[][] food) {
            this.set = new HashSet();
            set.add(0);//initially at [0][0]
            this.body = new LinkedList<Integer>();
            body.offerLast(0);
            this.food = food;
            this.width = width;
            this.height = height;
        }

        /**
         * Moves the snake.
         *
         * @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
         * @return The game's score after the move. Return -1 if game over.
         * Game over when snake crosses the screen boundary or bites its body.
         */
        public int move(String direction) {
            if (score == -1) {
                return -1;
            }

            //compute head
            int rowHead = body.peekFirst() / width;
            int colHead = body.peekFirst() % width;
            switch (direction) {
                case "U":
                    rowHead--;
                    break;
                case "D":
                    rowHead++;
                    break;
                case "L":
                    colHead--;
                    break;
                default:
                    colHead++;
            }
            int newHead = rowHead * width + colHead;

            set.remove(body.peekLast());//we'll remove the tail from set for now to see if it hits its tail
            //if it hits the boundary
            if (set.contains(newHead) || rowHead < 0 || colHead < 0 || rowHead >= height || colHead >= width) {
                return score = -1;
            }

            //add head for the following two normal cases:
            set.add(newHead);
            body.offerFirst(newHead);

            //normal eat case: keep tail, add head
            if (foodIndex < food.length && rowHead == food[foodIndex][0] && colHead == food[foodIndex][1]) {
                set.add(body.peekLast());//old tail does not change, so add it back to set since we removed it earlier
                foodIndex++;
                return ++score;
            }


            //normal move case without eating: move head and remove tail
            body.pollLast();
            return score;

        }
    }

/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */
}
