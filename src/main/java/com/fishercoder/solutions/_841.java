package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class _841 {
    public static class Solution1 {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Set<Integer> unvisitedRooms = new HashSet<>();
            for (int i = 1; i < rooms.size(); i++) {
                unvisitedRooms.add(i);
            }
            List<Integer> keys = rooms.get(0);
            Queue<Integer> queue = new LinkedList<>();
            for (int key : keys) {
                queue.offer(key);
            }
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int roomIndex = queue.poll();
                    unvisitedRooms.remove(roomIndex);
                    for (int j = 0; j < rooms.get(roomIndex).size(); j++) {
                        Integer nextRoom = rooms.get(roomIndex).get(j);
                        if (unvisitedRooms.contains(nextRoom) && !queue.contains(nextRoom)) {
                            queue.offer(nextRoom);
                        }
                    }
                }
            }
            return unvisitedRooms.isEmpty();
        }
    }
}
