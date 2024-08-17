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
    public int maxDepth(TreeNode root) {
        int res=solve(root);
        return res;
    }
    public int solve(TreeNode root){
        if(root==null || root==null){
            return 0;
        }
        else{
            return Math.max(1+(solve(root.left)),1+(solve(root.right)));
        }
    }
}