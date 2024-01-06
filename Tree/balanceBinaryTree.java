package Tree;

public class balanceBinaryTree {
    int val;
    balanceBinaryTree left;
    balanceBinaryTree right;
    
    balanceBinaryTree() {}
    
    balanceBinaryTree(int val) {
        this.val = val;
    }
    
    balanceBinaryTree(int val, balanceBinaryTree left, balanceBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isBalanced(balanceBinaryTree root) {
        return maxDepth(root) != -1;
    }
     public int maxDepth(balanceBinaryTree root) {
     if(root == null)
     {
         return 0;

     }   
     int left = maxDepth(root.left);
     if(left == -1) return -1;
     int right = maxDepth(root.right);
     if(right == -1) return -1;
     if(Math.abs(left - right) > 1) return -1;
     return 1+ Math.max(left ,right);
    }
}