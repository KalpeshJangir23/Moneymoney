package Tree;

import Tree.TreeNode;
import java.util.*;

public class RightSideView {

  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      int n = q.size();
      TreeNode dummy = new TreeNode();
      while (n-- > 0) {
        dummy = q.peek();
        q.remove();
        q.add(dummy.left);
        q.add(dummy.right);
      }
      list.add(dummy.val);
    }

    return list;
  }
}
