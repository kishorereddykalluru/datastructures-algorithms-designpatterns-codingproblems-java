package datastructures.trees;

public class SumOfNodes {

    public static int sumOfNodes(Node root) {
        if(root == null) return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        int[] nodeArray = {1,2,4,-1,-1,5,-1,-1, 3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createBinaryTree(nodeArray);
        System.out.println(sumOfNodes(root));
    }
}
