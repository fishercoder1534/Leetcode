# Introduction to Graphs and Trees in Graph Theory

In graph theory, mathematical structures are used to model pairwise relations between objects using **vertices** (nodes) connected by **edges** (links). Two of the most fundamental concepts within this field are **Trees** (acyclic networks) and **Shortest Path Optimizations** (weighted networks).

---

## Trees: Concepts and Properties

By definition, a **tree** is an undirected, connected graph that contains no cycles. If a tree has $n$ vertices, it always has exactly $n - 1$ edges. A collection of disconnected trees is formally referred to as a **forest**.

### Key Structural Implementation
When dealing with graph inputs in programming (such as an array of pairs `int[][] edges`), you typically construct an **adjacency list** to efficiently traverse the network:
```java
List<List<Integer>> adj = new ArrayList<>();
for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
for (int[] edge : edges) {
    adj.get(edge[0]).add(edge[1]);
    adj.get(edge[1]).add(edge[0]); // For undirected trees
}
```

---

## Common Structural Variations

### 1. Spanning Trees
A **spanning tree** is a subgraph of a connected, undirected graph $G$ that includes all the vertices of $G$ and is a tree. They are widely used in network routing and optimization problems, often computed via:
* **Kruskal's Algorithm**
* **Prim's Algorithm**

### 2. Shortest Path Trees (SPT)
While Spanning Trees minimize total edge weight across the entire network, a **Shortest Path Tree** is a rooted tree subgraph where the path distance from the root to any other vertex is minimized. It is most famously computed using **Dijkstra's Algorithm**.

---

## Optimization Algorithms: Dijkstra's Algorithm

Dijkstra's algorithm is a foundational graph theory algorithm that solves the **Single-Source Shortest Path (SSSP)** problem for directed or undirected graphs with non-negative edge weights.

### Generalized Java Template

```java
import java.util.*;

public class DijkstraTemplate {
    public static class Edge {
        int target;
        int weight;
        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    public int[] runDijkstra(int[][] edges, int numNodes, int source, boolean isOneIndexed) {
        int size = isOneIndexed ? numNodes + 1 : numNodes;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < size; i++) graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new Edge(v, w));
        }

        int[] dist = new int[size];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int currentDist = curr[1];

            if (currentDist > dist[u]) continue;

            for (Edge neighbor : graph.get(u)) {
                int v = neighbor.target;
                int weight = neighbor.weight;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        return dist;
    }
}
```

### Complexity Analysis
* **Time Complexity:** $\mathcal{O}((V + E) \log V)$ where $V$ is the number of vertices and $E$ is the number of edges.
* **Space Complexity:** $\mathcal{O}(V + E)$ required to store the adjacency list and priority queue tracking structures.

---

## Applications

Trees and Shortest Path frameworks are used extensively across computer science:
* **Hierarchical Data Representation:** File systems, HTML DOM trees.
* **Search and Sorting:** Binary Search Trees (BST), AVL trees, Red-Black trees.
* **Routing Protocols:** Spanning Tree Protocol (STP) and Link-State Routing (OSPF) via Dijkstra's algorithm.
* **Data Compression & Network Planning:** Huffman coding trees and optimal packet delay minimization.


# Advanced Shortest Path Optimizations: State-Space Dijkstra Algorithm

## State-Space Expansion in Weighted Networks

In standard graph navigation, the optimal path depends solely on the current spatial position, represented as a single-vertex state $u$. However, complex real-world routing and algorithmic challenges frequently introduce conditional constraints—such as keeping track of a continuous run of specific attributes, regulating a fuel supply, or managing limited structural skips.

To model these constraints without altering the core optimization properties of Dijkstra's algorithm, we perform **State-Space Expansion**. By expanding our node representations into multi-dimensional configurations $(u, \text{condition})$, the algorithm tracks rule compliance dynamically at every step of network traversal.

```
       Standard State                    Expanded State Space
       
          [ Node U ]                  [ Node U, Condition C1 ]
                                      [ Node U, Condition C2 ]
                                      [ Node U, Condition C3 ]
```

---

## The Generalized State-Space Java Template

When a shortest-path problem depends on rule compliance or context history, you can expand a standard 1D tracking array into a 2D matrix structure where state positions are recorded as `dist[node][condition]`.

```java
import java.util.*;

public class StateSpaceDijkstraTemplate {

    /**
     * Finds the shortest path in a graph subject to dynamic constraints.
     * 
     * @param n            Total number of nodes in the graph.
     * @param graph        Adjacency list containing elements in the format: [neighbor_node, edge_weight]
     * @param k            The maximum upper bound permitted for our active constraint.
     * @param startNode    The source node of the path.
     * @param targetNode   The destination node of the path.
     * @return             The minimum path weight matching constraints, or -1 if unreachable.
     */
    public int findShortestPath(int n, List<List<int[]>> graph, int k, int startNode, int targetNode) {
        // 1. Initialize a 2D distance array: dist[node][condition]
        // Size allocates (k + 1) slots to comfortably store data up to the inclusive bound k.
        int[][] dist = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        // 2. Setup Priority Queue sorted strictly by cumulative path weight (index 0)
        // Array layout: [cumulative_weight, current_node, current_condition]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a, b));

        // 3. Base Case Initialization
        int initialCondition = 1; // Calibrate based on target problem guidelines
        dist[startNode][initialCondition] = 0;
        pq.offer(new int[]{0, startNode, initialCondition});

        // 4. Main Search Execution
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currentWeight = curr[0];
            int u = curr[1];
            int currentCondition = curr[2];

            // Pruning Step: Skip if a strictly superior path to this exact sub-state is logged
            if (currentWeight > dist[u][currentCondition]) {
                continue;
            }

            // Target evaluation (Early exit strategy)
            if (u == targetNode) {
                return currentWeight;
            }

            // 5. Neighbor Relaxation Loop
            for (int[] edge : graph.get(u)) {
                int v = edge[0];
                int weight = edge[1];

                // --- CUSTOM STATE TRANSITION LOGIC ---
                int nextCondition = calculateNextCondition(u, v, currentCondition); 

                // Verify the evaluated state complies with constraints
                if (isValidState(nextCondition, k)) {
                    
                    // Standard Dijkstra Edge Relaxation
                    if (currentWeight + weight < dist[v][nextCondition]) {
                        dist[v][nextCondition] = currentWeight + weight;
                        pq.offer(new int[]{dist[v][nextCondition], v, nextCondition});
                    }
                }
            }
        }

        return -1; // Desired destination matches are unreachable
    }

    // Custom calculation stub to resolve problem variations
    private int calculateNextCondition(int u, int v, int currentCondition) {
        // Example configuration (e.g., if attribute matches, increment streak; otherwise reset to 1)
        return currentCondition; 
    }

    // Rule engine validator stub
    private boolean isValidState(int condition, int limit) {
        return condition <= limit;
    }
}
```

---

## Concrete Application: At Most K Consecutive Identical Characters

To illustrate the template in practice, consider finding the shortest path from node `0` to node `n - 1` in a directed graph where each node possesses a character label. The condition states that a path is invalid if it traverses more than $k$ consecutive nodes sharing identical labels.

### Algorithmic Transition Behavior
* **Streak Propagation:** When moving from $u$ to $v$, if $\text{labels}[u] == \text{labels}[v]$, the run lengthens: $\text{nextStreak} = \text{currentStreak} + 1$.
* **Streak Reset:** If $\text{labels}[u] \neq \text{labels}[v]$, the sequence is broken: $\text{nextStreak} = 1$.
* **Boundary Guard:** Paths evaluating to $\text{nextStreak} > k$ are truncated immediately.

### Time & Space Complexity

* **Time Complexity:** $\mathcal{O}((V \cdot K + E \cdot K) \log(V \cdot K))$. Each vertex is expanded into $K$ distinct operational states, meaning the search space effectively contains $V \cdot K$ virtual nodes and $E \cdot K$ potential edge transitions.
* **Space Complexity:** $\mathcal{O}(V \cdot K + E)$ to maintain the expanded 2D tracking matrix and handle heap allocations.
