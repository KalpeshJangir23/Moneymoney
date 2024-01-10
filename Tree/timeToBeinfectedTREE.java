package Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class timeToBeinfectedTREE {
    Map<Integer, List<Integer>> m = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    int start;

    public void t(TreeNode node) {
        if (node == null) return;

        if (node.left != null) {
            m.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.left.val);
            m.computeIfAbsent(node.left.val, k -> new ArrayList<>()).add(node.val);
            t(node.left);
        }

        if (node.right != null) {
            m.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.right.val);
            m.computeIfAbsent(node.right.val, k -> new ArrayList<>()).add(node.val);
            t(node.right);
        }
    }

    public int amountOfTime(TreeNode root, int start) {
        this.start = start;
        t(root);
        Queue<Integer> q = new LinkedList<>();
        int ct = 0;
        q.add(start);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int current = q.poll();
                visited.add(current);

                for (int neighbor : m.getOrDefault(current, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        q.add(neighbor);
                    }
                }
            }

            ct++;
        }

        return ct - 1;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(10);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(9);
        root.right.right.left = new TreeNode(2);

        timeToBeinfectedTREE solution = new timeToBeinfectedTREE();
        int startNode = 2;
        int result = solution.amountOfTime(root, startNode);

        System.out.println("Result: " + result);
    }
}