package DataStructures.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree();
        // Scanner scanner = new Scanner(System.in);
        // tree.insert(scanner);
        // tree.display();

        BST tree = new BST();
        int[] nums = { 8,4,9,2,5,1};
        tree.populateSorted(nums);
        tree.display();
    }
}