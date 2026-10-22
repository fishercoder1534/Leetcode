# Introduction to Trees in Graph Theory

In graph theory, a **tree** is a fundamental data structure and mathematical concept. By definition, a tree is an
undirected, connected graph that contains no cycles.

If a tree has $n$ vertices, it always has exactly $n - 1$ edges. A collection of disconnected trees is formally referred
to as a **forest**.

---

## Key Properties of Trees

1. If the input is like this: `int[][] edges`, you'll want to build an adjacent list: `List<List<Integer>>` to iterate
   through;

---

## Common Structural Variations

### 1. Spanning Trees

A **spanning tree** is a subgraph of a connected, undirected graph $G$ that includes all the vertices of $G$ and is a
tree. They are widely used in network routing and optimization problems, often computed via:

* **Kruskal's Algorithm**
* **Prim's Algorithm**

---

## Applications

Trees are used extensively across computer science and mathematics:

* **Hierarchical Data Representation:** File systems, HTML DOM trees.
* **Search and Sorting:** Binary Search Trees (BST), AVL trees, Red-Black trees.
* **Routing Protocols:** Spanning Tree Protocol (STP) in computer networking.
* **Data Compression:** Huffman coding trees.