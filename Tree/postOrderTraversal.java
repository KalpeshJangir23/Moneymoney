package Tree;


import java.util.*;


public class postOrderTraversal {
    
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    Node() {

    }
}
    static void postOrderTrav(Node curr, ArrayList < Integer > postOrder) {
        if (curr == null)
            return;

        
        postOrderTrav(curr.left, postOrder);
        postOrderTrav(curr.right, postOrder);
       
            postOrder.add(curr.data);
        
       // postOrder.add(curr.data);
    }

    public static void main(String args[]) {

        //Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.left.right.left = new Node(8);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.right.right.left = new Node(9);
        // root.right.right.right = new Node(10);
    //     1
    //     /   \
    //    2     3
    //   / \   / \
    //  4   5 6   7
    //     /     / \
    //    8     9   10
     

        // ArrayList < Integer > preOrder = new ArrayList < > ();
        // postOrderTrav(root, preOrder);

        // System.out.print("The preOrder Traversal is : ");
        // for (int i = 0; i < preOrder.size(); i++) {
        //     System.out.print(preOrder.get(i) + " ");
        // }

    }
}