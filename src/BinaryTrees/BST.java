package BinaryTrees;

/**
 * Class created by Krish
 */

public class BST {

    private BSTNode rootNode;

    public BST(int data) {
        rootNode = new BSTNode(data);
    }

    public void addNode(int i) {
        BSTNode currentNode = rootNode;
        boolean finished = false;
        do {
            BSTNode leftNode = currentNode.leftNode;
            BSTNode rightNode = currentNode.rightNode;
            int data = currentNode.data;
            if (i > data) {
                if (rightNode == null) {
                    currentNode.rightNode = new BSTNode(i);
                    finished = true;
                } else {
                    currentNode = rightNode;
                }
            } else {
                if (leftNode == null) {
                    currentNode.leftNode = new BSTNode(i);
                    finished = true;
                } else {
                    currentNode = leftNode;
                }
            }
        } while (!finished);
    }

    public void preorderPrint(BSTNode node) {
        System.out.print(node.data + "\t");
        if (node.leftNode != null)
            preorderPrint(node.leftNode);
        if (node.rightNode != null)
            preorderPrint(node.rightNode);
    }

    public void inorderPrint(BSTNode node) {
        if (node.leftNode != null)
            inorderPrint(node.leftNode);
        System.out.print(node.data + "\t");
        if (node.rightNode != null)
            inorderPrint(node.rightNode);
    }

    public void postorderPrint(BSTNode node) {
        if (node.leftNode != null)
            postorderPrint(node.leftNode);
        if (node.rightNode != null)
            postorderPrint(node.rightNode);
        System.out.print(node.data + "\t");
    }

    public static void main(String[] args) {
        BST bst = new BST(5);
        bst.addNode(6);
        bst.addNode(3);
        bst.addNode(11);
        bst.addNode(4);
        bst.addNode(9);
        bst.addNode(18);
        bst.addNode(1);
        bst.preorderPrint(bst.rootNode);
        System.out.println();
        bst.inorderPrint(bst.rootNode);
        System.out.println();
        bst.postorderPrint(bst.rootNode);
    }

}