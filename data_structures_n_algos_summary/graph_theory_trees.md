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