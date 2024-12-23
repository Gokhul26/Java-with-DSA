package DataStructures.Trees;

import Recursion.returnAllIndex;

public class BST {
    private class Node {
        private int value;
        private Node leftNode;
        private Node rightNode;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    public boolean isEmpty(){
        return rootNode == null;
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;

    }

    private Node rootNode;

    public BST() {
    }

    public void insert(int value){
        rootNode = insert(value, rootNode);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.leftNode = insert(value, node.leftNode);
        }

        if(value > node.value){
            node.rightNode = insert(value, node.rightNode);
        }

        node.height = Math.max(height(node.leftNode),height(node.rightNode)) + 1;

        return node;
    }

    public boolean balanced(){
        return balanced(rootNode);
    }

    public boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.leftNode) - height(node.rightNode)) <= 1 && balanced(node.leftNode) && balanced(node.rightNode);
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0 , nums.length);
    }

    private void populateSorted(int[] nums,int start,int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, 0, mid);
        populateSorted(nums, mid + 1, end);
    }


    public void display(){
        display(this.rootNode, "Root node is ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);
        display(node.leftNode , "Left node of " + node.value + ": ");
        display(node.rightNode , "Right node of " + node.value + ": ");
    }
}
