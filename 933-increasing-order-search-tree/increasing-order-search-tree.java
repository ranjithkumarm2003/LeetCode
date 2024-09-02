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
     TreeNode ans=new TreeNode(-1);
     TreeNode temp=ans;
    public TreeNode increasingBST(TreeNode root) {
       if(root==null){
        return null;
       }
       increasingBST(root.left);
       ans.right=root;
       root.left=null;
       ans.left=null;
       ans=ans.right;
       increasingBST(root.right);
    return temp.right;
    }
}