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
class Solution {
    double max=Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean left = isValidBST(root.left);
        boolean num=((double)(root.val)/2>max);
        max=(double)(root.val)/2;
        boolean right=isValidBST(root.right);
        return left && num && right;
    }
}