# Data Structures & Algorithms Study Guide

A structured, template-driven reference guide to core data structures, algorithmic paradigms, and Java implementation blueprints—organized following the **[LeetCode 75 Study Plan](https://leetcode.com/studyplan/leetcode-75/)** progression.

---

## 📚 Core Curriculum (LeetCode 75 Roadmap)

### Phase 1: Linear Structures & Windowing
| # | Topic | Guide | Primary Time / Space | Key Patterns & Use Cases |
| :---: | :--- | :--- | :--- | :--- |
| **01** | **Array & String** | [`01_array_string.md`](./01_array_string.md) | $O(N)$ / $O(1)$–$O(N)$ | In-place mutations, string builders, GCD of strings, greedy array scans |
| **02** | **Two Pointers** | [`02_two_pointers.md`](./02_two_pointers.md) | $O(N)$ / $O(1)$ | Converging pointers, fast/slow runners, container water trapping |
| **03** | **Sliding Window** | [`03_sliding_window.md`](./03_sliding_window.md) | $O(N)$ / $O(1)$–$O(K)$ | Fixed-size windows, dynamic shrinking/expanding windows |
| **04** | **Prefix Sum** | [`04_prefix_sum.md`](./04_prefix_sum.md) | $O(N)$ / $O(N)$ | Range sum queries in $O(1)$, pivot indices, prefix XOR masks |
| **05** | **Hash Map & Set** | [`05_hash_map_set.md`](./05_hash_map_set.md) | $O(N)$ / $O(N)$ | Frequency counting, $O(1)$ lookups, structural equality |

### Phase 2: Stacks, Queues & Linked Lists
| # | Topic | Guide | Primary Time / Space | Key Patterns & Use Cases |
| :---: | :--- | :--- | :--- | :--- |
| **06** | **Stack** | [`06_stack.md`](./06_stack.md) | $O(N)$ / $O(N)$ | Bracket matching, expression decoding, `ArrayDeque` best practices |
| **07** | **Queue** | [`07_queue.md`](./07_queue.md) | $O(N)$ / $O(N)$ | FIFO buffering, recent call counters, state simulation |
| **08** | **Linked List** | [`08_linked_list.md`](./08_linked_list.md) | $O(N)$ / $O(1)$ | Dummy head nodes, in-place reversal, cycle detection, fast/slow midpoint |

### Phase 3: Trees & Graphs
| # | Topic | Guide | Primary Time / Space | Key Patterns & Use Cases |
| :---: | :--- | :--- | :--- | :--- |
| **09** | **Binary Tree — DFS** | [`09_binary_tree_dfs.md`](./09_binary_tree_dfs.md) | $O(N)$ / $O(H)$ | Preorder/Inorder/Postorder recursion, path sums, LCA |
| **10** | **Binary Tree — BFS** | [`10_binary_tree_bfs.md`](./10_binary_tree_bfs.md) | $O(N)$ / $O(W)$ | Level-order traversal, right-side view, level maximums |
| **11** | **Binary Search Tree** | [`11_binary_search_tree.md`](./11_binary_search_tree.md) | $O(H)$ / $O(H)$ | Inorder sorted property, search, node deletion & successor replacement |
| **12** | **Graphs — DFS** | [`12_graphs_dfs.md`](./12_graphs_dfs.md) | $O(V + E)$ / $O(V + E)$ | Adjacency list construction, connected components, cycle detection |
| **13** | **Graphs — BFS** | [`13_graphs_bfs.md`](./13_graphs_bfs.md) | $O(V + E)$ / $O(V + E)$ | Unweighted shortest path, multi-source BFS, grid traversal |

### Phase 4: Search, Heaps & Optimization
| # | Topic | Guide | Primary Time / Space | Key Patterns & Use Cases |
| :---: | :--- | :--- | :--- | :--- |
| **14** | **Heap / Priority Queue** | [`14_heap_priority_queue.md`](./14_heap_priority_queue.md) | $O(N \log K)$ / $O(K)$ | Top-$K$ elements, min/max binary heap mechanics, task scheduling |
| **15** | **Binary Search** | [`15_binary_search.md`](./15_binary_search.md) | $O(\log N)$ / $O(1)$ | Search space reduction, lower/upper bounds, binary search on answer |
| **16** | **Backtracking** | [`16_backtracking.md`](./16_backtracking.md) | $O(B^D)$ / $O(D)$ | Decision trees, subsets, combinations, state pruning |

### Phase 5: Dynamic Programming & Specialized Structures
| # | Topic | Guide | Primary Time / Space | Key Patterns & Use Cases |
| :---: | :--- | :--- | :--- | :--- |
| **17** | **DP — 1D** | [`17_dp_1d.md`](./17_dp_1d.md) | $O(N)$ / $O(N)$ or $O(1)$ | State transitions, recurrence relations, space optimization |
| **18** | **DP — Multidimensional** | [`18_dp_multidimensional.md`](./18_dp_multidimensional.md) | $O(M \cdot N)$ / $O(M \cdot N)$ | Grid path counting, LCS, edit distance, 2D state tables |
| **19** | **Bit Manipulation** | [`bit_manipulation.md`](19_bit_manipulation.md) | $O(1)$–$O(N)$ / $O(1)$ | Bitmasks, XOR cancellation, Two's Complement, PopCount tricks |
| **20** | **Trie (Prefix Tree)** | [`20_trie.md`](./20_trie.md) | $O(L)$ / $O(\Sigma \cdot N \cdot L)$ | Prefix lookups, autocomplete search suggestions, word dictionaries |
| **21** | **Intervals** | [`21_intervals.md`](./21_intervals.md) | $O(N \log N)$ / $O(N)$ | Sorting by start/end times, merging overlaps, greedy scheduling |
| **22** | **Monotonic Stack** | [`monotonic_stack_guide.md`](22_monotonic_stack.md) | $O(N)$ / $O(N)$ | Single-pass next greater/smaller, two-pass reverse scan ramps |

---

## 🧩 Supplementary Core CS Guides

Topics frequently tested in technical interviews that extend beyond the standard 75-problem scope:

| Topic | Guide | Primary Time / Space | Key Patterns & Use Cases |
| :--- | :--- | :--- | :--- |
| **Union-Find (Disjoint Set)** | [`union_find_disjoint_set.md`](./union_find_disjoint_set.md) | $O(\alpha(N))$ / $O(N)$ | Dynamic connectivity, path compression, dummy border nodes |
| **Shortest Path Algorithms** | [`shortest_path_algorithms.md`](./shortest_path_algorithms.md) | $O(E \log V)$ / $O(V + E)$ | Dijkstra's algorithm, Bellman-Ford, weighted graph navigation |
| **Minimum Spanning Tree** | [`minimum_spanning_tree.md`](./minimum_spanning_tree.md) | $O(E \log E)$ / $O(V + E)$ | Kruskal's algorithm (with DSU), Prim's algorithm |
| **Graph Theory & Trees** | [`graph_theory_trees.md`](./graph_theory_trees.md) | — | Foundational definitions, tree properties ($E = V - 1$), edge list conversions |

---

## 🛠️ Standard Guide Blueprint

Each topic guide in this directory follows a consistent structure for fast review:
1. **Core Concept & Complexity:** Why the pattern optimizes naive approaches.
2. **Pattern Recognition Checklist:** Mental triggers to identify when to apply it.
3. **Java Master Template:** Idiomatic, copy-paste-ready Java boilerplate (favoring `ArrayDeque` over legacy `Stack`).
4. **Curated Practice Problems:** Direct references to solved problems in [`src/main/java/com/fishercoder/solutions/`](../src/main/java/com/fishercoder/solutions/).