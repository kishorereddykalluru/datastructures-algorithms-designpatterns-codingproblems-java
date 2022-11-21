package datastructures.trees;

public class BinaryTree {

    static int idx = -1;
    public Node createBinaryTree(int [] array) {
        idx++;

        if(array[idx] == -1) {
            return null;
        }

        Node newNode = new Node(array[idx]);

        newNode.left = createBinaryTree(array);
        newNode.right = createBinaryTree(array);


        return newNode;
    }
}
