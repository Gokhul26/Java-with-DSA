package DataStructures.Trees;

public class AVL {
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

    public int height(){
        return height(rootNode);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;

    }

    private Node rootNode;

    public AVL() {
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

        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.leftNode) - height(node.rightNode) > 1){
            //left heavy
            if(height(node.leftNode.leftNode) - height(node.leftNode.rightNode) > 0 ){
                //left-left case:
                return rotateRight(node);
            } 
            if(height(node.leftNode.leftNode) - height(node.leftNode.rightNode) < 0 ){
                //left-right case
                node.leftNode = rotateLeft(node.leftNode);
                return rotateRight(node);

            }
        }

        if(height(node.leftNode) - height(node.rightNode) < -1){
            //right heavy
            if(height(node.rightNode.leftNode) - height(node.rightNode.rightNode) < 0){
                //right-right case
                return rotateLeft(node);
            }
            if(height(node.rightNode.leftNode) - height(node.rightNode.rightNode) > 0){
                //right-left case
                node.rightNode = rotateRight(node.rightNode);
                return rotateLeft(node);
            }
        }
        return node;
    }

    private Node rotateRight(Node p){
        Node c = p.leftNode;
        Node t = c.rightNode;

        c.rightNode = p;
        p.leftNode = t;

        p.height = Math.max(height(p.leftNode), height(p.rightNode)) + 1;
        c.height = Math.max(height(c.leftNode), height(c.rightNode)) + 1;

        return c;
    }    

    private Node rotateLeft(Node p){
        Node c = p.rightNode;
        Node t = c.leftNode;

        c.leftNode = p;
        p.rightNode  = t;

        p.height = Math.max(height(p.leftNode), height(p.rightNode)) + 1;
        c.height = Math.max(height(c.leftNode), height(c.rightNode)) + 1;

        return c;
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

    public void preOrder(){
        preOrder(rootNode);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.value);
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }

    public void inOrder(){
        inOrder(rootNode);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        
        inOrder(node.leftNode);
        System.out.println(node.value);
        inOrder(node.rightNode);
    }

    public void postOrder(){
        postOrder(rootNode);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        
        postOrder(node.leftNode);
        postOrder(node.rightNode);
        System.out.println(node.value);
    }
}
