package Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class diameterofBinaryTree {
    int maxi = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return maxi;
    }

    void findMax(TreeNode root) {
        if (root == null) {
            return;
        }
        int left = findHeight(root.left);
        int right = findHeight(root.right);

        maxi = Math.max(maxi, left + right);
        findMax(root.left);
        findMax(root.right);
    }

    static int findHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int left = findHeight(node.left);
            int right = findHeight(node.right);
            return Math.max(left, right) + 1;
        }
    }
}