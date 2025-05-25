package DataStructures.Trees;

import java.util.*;

// import DataStructures.LinkedList.TreeNode;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BottomViewDFS {
    // Map to store the latest node value for each column (key: column, value: node.val)
    private static Map<Integer, Integer> bottomViewMap = new TreeMap<>();

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
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.right = new TreeNode(7);

        // Perform DFS to compute Bottom View
        dfs(root, 0);

        // Print the Bottom View from leftmost to rightmost column
        System.out.println("Bottom View of the binary tree:");
        for (int col : bottomViewMap.keySet()) {
            System.out.print(bottomViewMap.get(col) + " ");
        }
    }

    // DFS traversal to fill bottomViewMap with latest node at each column
    private static void dfs(TreeNode node, int col) {
        if (node == null) return;

        // For bottom view, always update the value for the column (overwrite)
        bottomViewMap.put(col, node.val);

        // Traverse left subtree with column - 1
        dfs(node.left, col - 1);

        // Traverse right subtree with column + 1
        dfs(node.right, col + 1);
    }
}
