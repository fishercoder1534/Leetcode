# Binary Search Tree

* **Inorder traversal** of BST is an array **sorted** in ascending order:
    * **Left -> Node -> Right**

### Successor

* **Successor** = "after node", i.e. the next node, or the **smallest node** after the current one.
* It's also the next node in the inorder traversal.
* To find a successor, go to the right *once* and then *as many times* to the left as you could.

```java
public TreeNode successor(TreeNode root) {
    root = root.right;
    while (root.left != null) {
        root = root.left;
    }
    return root;
}
```

### Predecessor

* **Predecessor** = "before node", i.e. the previous node, or the **largest node** before the current one.
* It's also the previous node in the inorder traversal.
* To find a predecessor, go to the left *once* and then *as many times* to the right as you could.

```java
public TreeNode predecessor(TreeNode root) {
    root = root.left;
    while (root.right != null) {
        root = root.right;
    }
    return root;
}
```
