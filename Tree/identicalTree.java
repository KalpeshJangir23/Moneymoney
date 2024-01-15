package Tree;

import java.util.*;;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class identicalTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> leftTree = new ArrayList<>();
        List<Integer> rightTree = new ArrayList<>();
        inorderTraveslWithList(p, leftTree);
        inorderTraveslWithList(q, rightTree);
        return leftTree.equals(rightTree);
    }

    static void inorderTraveslWithList(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        inorderTraveslWithList(root.left, list);
        inorderTraveslWithList(root.right, list);
    }

}
