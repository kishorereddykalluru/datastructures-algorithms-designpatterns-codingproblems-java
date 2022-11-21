package datastructures.trees;

public class CountOfNode {

    public static int countOfNodes(Node root) {
        if(root == null){
            return 0;
        }

        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);

        return leftCount + rightCount + 1;
    }


    public static void main(String[] args) {

        int[] nodeArray = {1,2,4,-1,-1,5,-1,-1, 3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createBinaryTree(nodeArray);
        System.out.println(countOfNodes(root));
    }
}
