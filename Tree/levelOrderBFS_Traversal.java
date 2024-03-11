package Tree;

import java.util.*;



public class levelOrderBFS_Traversal {
    class Node {
        int data;
        Node left, right;
    
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
     static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> listoflist = new ArrayList<>();
        if (root == null) {
            return listoflist;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.data);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            listoflist.add(currentLevel);
        }

        return listoflist;
    }

    public static void main(String[] args) {
        

    }
}
