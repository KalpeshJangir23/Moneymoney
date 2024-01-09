package Tree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class diameterofBinaryTree {
    public static int levelOrder(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
               
                if (currentNode.data >= low && currentNode.data <= high) {
                    sum = sum + currentNode.data;
                }

                if (currentNode.left != null && currentNode.left.data >= low && currentNode.left.data <= high) {
                    sum = sum + currentNode.left.data;
                }
                if (currentNode.right != null && currentNode.right.data >= low && currentNode.right.data <= high) {
                    sum = sum + currentNode.right.data;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println(levelOrder(root, 3,7));
    }
}
