package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1600 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * 1. use a tree structure to represent the king family;
         * 2. then use preorder traversal to find the inheritance order;
         * 3. use a map to quickly find the corresponding node in the tree based on the name since all names are distinct
         */
        public static class Person {
            List<Person> children;
            String name;
            boolean isAlive;

            public Person(String kingName) {
                this.name = kingName;
                this.children = new ArrayList<>();
                this.isAlive = true;
            }
        }

        public static class ThroneInheritance {
            Person king;
            Map<String, Person> map;
            String kingName;

            public ThroneInheritance(String kingName) {
                king = new Person(kingName);
                map = new HashMap<>();
                this.kingName = kingName;
                map.put(kingName, king);
            }

            public void birth(String parentName, String childName) {
                Person parentNode = map.getOrDefault(parentName, new Person(parentName));
                Person child = new Person(childName);
                parentNode.children.add(child);
                map.put(parentName, parentNode);
                map.put(childName, child);
            }

            public void death(String name) {
                Person deadPerson = map.get(name);
                deadPerson.isAlive = false;
                map.put(name, deadPerson);
            }

            public List<String> getInheritanceOrder() {
                return preorder(map.get(this.kingName), new ArrayList<>());
            }

            private List<String> preorder(Person person, List<String> list) {
                if (person == null) {
                    return list;
                }
                if (person.isAlive) {
                    list.add(person.name);
                }
                for (Person child : person.children) {
                    preorder(child, list);
                }
                return list;
            }
        }
    }
}
