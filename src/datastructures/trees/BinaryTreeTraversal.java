package datastructures.trees;

public class BinaryTreeTraversal {

    public static void preorder(Node root) {
        if(root == null) return;

        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void postorder(Node root) {
        if(root == null)return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {

        int[] nodeArray = {1,2,4,-1,-1,5,-1,-1, 3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createBinaryTree(nodeArray);
        preorder(root);

    }
}
