package DataStructures.Trees;

import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node rootNode;
    
        public BinaryTree(){
    
        }
    
        //insert
        public void insert(Scanner scanner){
            System.out.println("Enter the value of root node");
            int value = scanner.nextInt();
            rootNode = new Node(value);
            insert(scanner, rootNode);
        }
    
        private void insert(Scanner scanner, Node node){
            System.out.println("Do you wanna insert left of " + node.value);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("Enter the element you wanna insert in the left of "+ node.value);
                int value = scanner.nextInt();
                node.left = new Node(value);
                insert(scanner, node.left);
            }
    
            System.out.println("Do you wanna insert right of " + node.value);
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("Enter the element you wanna insert in the right of "+ node.value);
                int value = scanner.nextInt();
                node.right = new Node(value);
                insert(scanner, node.right);
            }
        }
    
        public void display(){
            display(this.rootNode, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }

        System.out.println(indent+ node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }
}
