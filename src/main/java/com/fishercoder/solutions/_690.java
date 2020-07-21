package com.fishercoder.solutions;

import com.fishercoder.common.classes.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class _690 {

    public static class Solution1 {

        int total = 0;

        public int getImportance(List<Employee> employees, int id) {
            Employee manager = employees.stream().filter(e -> e.id == id).collect(Collectors.toList()).get(0);
            total += manager.importance;
            manager.subordinates.forEach(subId -> getImportance(employees, subId));

            /**The above line is equivalent to below for loop*/
//            for (int subId : manager.subordinates) {
//                getImportance(employees, subId);
//            }

            return total;
        }

    }
}
