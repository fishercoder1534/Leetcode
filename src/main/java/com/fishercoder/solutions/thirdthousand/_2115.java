package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _2115 {
    public static class Solution1 {
        /**
         * My completely original solution, topological sort template comes in pretty handy.
         */
        public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
            Set<String> allRecipes = new HashSet<>();
            Collections.addAll(allRecipes, recipes);

            Set<String> allSupplies = new HashSet<>();
            Collections.addAll(allSupplies, supplies);

            Map<String, Integer> indegree = new HashMap<>();
            Map<String, List<String>> adjList = new HashMap<>();
            Map<String, List<String>> ingredientMap = new HashMap<>();
            for (int i = 0; i < ingredients.size(); i++) {
                int dependencyCount = 0;
                for (String ingredient : ingredients.get(i)) {
                    if (allRecipes.contains(ingredient)) {
                        dependencyCount++;
                        List<String> list = adjList.getOrDefault(ingredient, new ArrayList<>());
                        list.add(recipes[i]);
                        adjList.put(ingredient, list);
                    }
                }
                indegree.put(recipes[i], dependencyCount);
                ingredientMap.put(recipes[i], ingredients.get(i));
            }
            Queue<String> q = new LinkedList<>();
            for (Map.Entry<String, Integer> entry : indegree.entrySet()) {
                if (entry.getValue() == 0 && allSupplies.containsAll(ingredientMap.get(entry.getKey()))) {
                    q.offer(entry.getKey());
                }
            }
            List<String> result = new ArrayList<>();
            while (!q.isEmpty()) {
                String curr = q.poll();
                result.add(curr);
                for (String neighbor : adjList.getOrDefault(curr, new ArrayList<>())) {
                    indegree.put(neighbor, indegree.get(neighbor) - 1);
                    if (indegree.get(neighbor) == 0) {
                        q.offer(neighbor);
                    }
                }
            }
            return result;
        }

    }
}
