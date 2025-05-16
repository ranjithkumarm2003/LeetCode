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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,targetSum);

    }
     public boolean solve(TreeNode root, int targetSum)
     {
        if(root==null)
        {
            return false;
        }
        if(targetSum-root.val==0 && root.left==null && root.right==null)
        {
            return true;
        }
        else
        {
            targetSum-=root.val;
            return solve(root.left,targetSum) || solve(root.right,targetSum);
           
        }
     }
}