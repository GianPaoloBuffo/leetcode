package twoHundredThirtyFive_lowestCommonAncestorBinarySearchTree;

import util.TreeNode;

public class Solution {

    // Time Complexity: O(logn) because binary search
    // Space Complexity: 0(1)
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while (current != null) {
            if (p.val > current.val && q.val > current.val)
                current = current.right;
            else if (p.val < current.val && q.val < current.val)
                current = current.left;
            else return current;
        }

        // Alternatively
        // if (p.val > root.val && q.val > root.val)
        //     return lowestCommonAncestor(root.right, p, q);
        //
        // if (p.val < root.val && q.val < root.val)
        //     return lowestCommonAncestor(root.left, p, q);

        return root;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(2,
                new TreeNode(0), new TreeNode(4,
                new TreeNode(3), new TreeNode(5)));

        TreeNode q = new TreeNode(8,
                new TreeNode(7), new TreeNode(9));

        TreeNode tree = new TreeNode(6, p, q);

        System.out.println(lowestCommonAncestor(tree, p, q));
    }
}
