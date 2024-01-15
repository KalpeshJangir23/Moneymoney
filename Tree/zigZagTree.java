package Tree;
import java.util.*;

public class zigZagTree {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listoflist = new ArrayList<>();
        if (root == null) {
            return listoflist;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Boolean lzag = true;
        Boolean rzag = false;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            if (rzag) {
                Collections.reverse(currentLevel);
            }
            
            listoflist.add(currentLevel);
            
            rzag = !rzag;
        }

        return listoflist;
    }
}