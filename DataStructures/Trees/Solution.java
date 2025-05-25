package DataStructures.Trees;

import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    Map<Integer, List<int[]>> map = new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        traverse(root, 0, 0);

        for (List<int[]> arrays : map.values()) {
            // Sort by level first, then by value
            arrays.sort((a, b) -> {
                if (a[1] == b[1]) return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            });

            List<Integer> temp = new ArrayList<>();
            for (int[] pair : arrays) {
                temp.add(pair[0]);
            }
            ans.add(temp);
        }

        return ans;
    }

    private void traverse(TreeNode node, int col, int level) {
        if (node == null) return;

        map.putIfAbsent(col, new ArrayList<>());
        map.get(col).add(new int[]{node.val, level});

        traverse(node.left, col - 1, level + 1);
        traverse(node.right, col + 1, level + 1);
    }

    // Helper method to print vertical traversal output
    private static void printVerticalTraversal(List<List<Integer>> traversal) {
        int colNum = 0;
        for (List<Integer> colList : traversal) {
            System.out.print("Column " + colNum + ": ");
            for (int val : colList) {
                System.out.print(val + " ");
            }
            System.out.println();
            colNum++;
        }
    }

    // Example usage:
    public static void main(String[] args) {
        /*
               3
              / \
             9  20
                /  \
               15   7
        */

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        
        // Left subtree of root.left
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        
        // Right subtree of root.right
        TreeNode rightSubtree = new TreeNode(18);
        rightSubtree.left = new TreeNode(16);
        rightSubtree.right = new TreeNode(20);
        
        root.right.right = rightSubtree;
        
        // Adding one more level deeper on left subtree
        root.left.left.left = new TreeNode(1);
        root.left.right.right = new TreeNode(9);
        

        Solution sol = new Solution();
        List<List<Integer>> result = sol.verticalTraversal(root);

        printVerticalTraversal(result);
    }
}
