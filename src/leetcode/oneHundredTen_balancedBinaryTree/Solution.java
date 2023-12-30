package leetcode.oneHundredTen_balancedBinaryTree;

import leetcode.util.TreeNode;

public class Solution {

    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        return height(root) != -1;
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight == -1 || rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
