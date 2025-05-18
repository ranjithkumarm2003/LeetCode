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
    int c=1;int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        solver(root,k);
        return ans;
   
    }
    public void solver(TreeNode root,int k){
        if(root==null){
            return;
        }
        solver(root.left,k);
        
        if(c++==k){
            ans=root.val;
            return;
        }
        solver(root.right,k);
    }
}