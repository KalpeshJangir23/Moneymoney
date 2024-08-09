package Tree;

import Tree.TreeNode;
import java.util.*;

public class Path2 {

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> res = new ArrayList<>();
    solve_inorder(res, new ArrayList<>(), root, targetSum, 0);
    return res;
  }

  static void solve_inorder(
    List<List<Integer>> res,
    List<Integer> temp,
    TreeNode curr,
    int target,
    int sum
  ) {
    if (curr == null) {
      return;
    }

    temp.add(curr.val);
    sum += curr.val;

    // Check if we have reached a leaf node and the path sum equals target
    if (curr.left == null && curr.right == null && sum == target) {
      res.add(new ArrayList<>(temp));
    } else {
      // Recurse on left and right children
      solve_inorder(res, temp, curr.left, target, sum);
      solve_inorder(res, temp, curr.right, target, sum);
    }

    // Backtrack to explore other paths
    temp.remove(temp.size() - 1);
    sum -= curr.val;
  }
}
