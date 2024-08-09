package Tree;

import Tree.TreeNode;
import java.util.*;

public class MakingTreeFromPreOrderAndInorder {

  static TreeNode root = new TreeNode();

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    int n = inorder.length;
    return solve(preorder, inorder, 0, 0, n);
  }

  static TreeNode solve(
    int[] preorder,
    int[] inorder,
    int index,
    int start,
    int end
  ) {
    if (start > end) {
      return null;
    }
    int rootVal = preorder[index];
    int i = start;
    for (; i <= end; i++) {
      if (inorder[i] == rootVal) {
        break;
      }
    }

    index++;
    TreeNode root = new TreeNode(rootVal);
    root.left = solve(preorder, inorder, index, start, i - 1);
    root.right = solve(preorder, inorder, index, i + 1, end);
    return root;
  }
}
