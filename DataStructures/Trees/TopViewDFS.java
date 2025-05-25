package DataStructures.Trees;

import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TopViewDFS {
    // Map to store first node encountered at each vertical column (key: column, value: node.val)
    private static Map<Integer, Integer> topViewMap = new TreeMap<>();

    public static void main(String[] args) {
        // Create the binary tree
        /*
               1
             /   \
            2     3
             \   /  \
              4 5    6
                 \
                  7
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        root.right.right.right = new TreeNode(69);
        root.right.left = new TreeNode(9);

        // Perform DFS to compute Top View
        dfs(root, 0);

        // Print the Top View from leftmost to rightmost column
        System.out.println("Top View of the binary tree:");
        for (int col : topViewMap.keySet()) {
            System.out.print(topViewMap.get(col) + " ");
        }
    }

    // DFS traversal to fill topViewMap with first node encountered per column
    private static void dfs(TreeNode node, int col) {
        if (node == null) return;

        // If this column is not yet seen, add the node value
        if (!topViewMap.containsKey(col)) {
            topViewMap.put(col, node.val);
        }

        // Traverse left subtree with column - 1
        dfs(node.left, col - 1);

        // Traverse right subtree with column + 1
        dfs(node.right, col + 1);
    }
}
