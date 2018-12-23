package com.fishercoder.common.utils;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This is a util class to contain all tree related methods.
 */
public class TreeUtils {
/**
* This method is to construct a normal binary tree. The input reads like
* this for [5, 3, 6, 2, 4, null, null, 1], i.e. preorder:
               5
             /   \
            3     6
           / \    / \
          2   4  #   #
         /
        1
*/
@Notes(context = "This is usually how Leetcode OJ passes a binary tree into testing: "
	+ "https://leetcode.com/faq/#binary-tree, I wrote this function for my own ease of testing when copying"
	+ "the test case from Leetcode in the form of [1, null, 2, 3].")
public static TreeNode constructBinaryTree(List<Integer> treeValues) {
	TreeNode root = new TreeNode(treeValues.get(0));
	Queue<TreeNode> queue = new LinkedList<>();
	queue.offer(root);
	for (int i = 1; i < treeValues.size(); i++) {
		TreeNode curr = queue.poll();
		if (treeValues.get(i) != null) {
			curr.left = new TreeNode(treeValues.get(i));
			queue.offer(curr.left);
		}
		if (++i < treeValues.size() && treeValues.get(i) != null) {
			curr.right = new TreeNode(treeValues.get(i));
			queue.offer(curr.right);
		}
	}
	return root;
}

	public static void printBinaryTree(TreeNode root) {
		CommonUtils.println("\nPrinting out the binary tree in a very visual manner as below:\n");

		// imitating from BTreePrinter class
		int maxLevel = TreeUtils.maxLevel(root);

		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static int maxLevel(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return Math.max(TreeUtils.maxLevel(root.left),
			TreeUtils.maxLevel(root.right)) + 1;
	}

	private static void printNodeInternal(
		List<TreeNode> list, int level, int maxLevel) {
		if (list.isEmpty() || CommonUtils.isAllElementsNull(list)) {
			return;
		}

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		CommonUtils.printWhitespaces(firstSpaces);

		List<TreeNode> newNodes = new ArrayList<>();
		for (TreeNode node : list) {
			if (node != null) {
				System.out.print(node.val);
				newNodes.add(node.left);
				newNodes.add(node.right);
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}

			CommonUtils.printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < list.size(); j++) {
				CommonUtils.printWhitespaces(firstSpaces - i);
				if (list.get(j) == null) {
					CommonUtils.printWhitespaces(endgeLines + endgeLines + i
						+ 1);
					continue;
				}

				if (list.get(j).left != null) {
					System.out.print("/");
				} else {
					CommonUtils.printWhitespaces(1);
				}

				CommonUtils.printWhitespaces(i + i - 1);

				if (list.get(j).right != null) {
					System.out.print("\\");
				} else {
					CommonUtils.printWhitespaces(1);
				}

				CommonUtils.printWhitespaces(endgeLines + endgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	public static void inOrderTraversal(TreeNode root) {
		inOrder(root);
	}

	private static void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}

	public static void main(String... args) {
		//test random int generator
		List<Integer> treeValues = CommonUtils.randomIntArrayGenerator(24);

		List<Integer> treeValues2 = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

		//test tree construction
		//		TreeNode root1 = bruteForceConstructBinaryTree(treeValues2);
		//		inOrderTraversal(root1);
		//		printBinaryTree(root1);

		// test tree construction
		TreeNode root2 = constructBinaryTree(treeValues);
		inOrderTraversal(root2);
		printBinaryTree(root2);

		List<Integer> treeVals = new ArrayList<>(Arrays.asList(1, null, 2, 3));
		CommonUtils.printList(treeVals);
		root2 = constructBinaryTree(treeVals);
		//		inOrderTraversal(root2);
		printBinaryTree(root2);
	}
}
