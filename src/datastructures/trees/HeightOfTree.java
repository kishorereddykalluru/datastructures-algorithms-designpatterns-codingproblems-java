package datastructures.trees;

public class HeightOfTree {

    public static int heightOfTree(Node root) {

        if(root == null) return 0;

        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    public static void main(String[] args) {
        int[] nodeArray = {1,2,4,-1,-1,5,-1,-1, 3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createBinaryTree(nodeArray);
        System.out.println(heightOfTree(root));
    }
}
