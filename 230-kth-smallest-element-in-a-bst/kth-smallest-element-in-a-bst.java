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
    Set<Integer> set=new TreeSet<>();
    public int kthSmallest(TreeNode root, int k) {
        solver(root);
        int j=1;
        for(int i:set){
          if(j++==k){
            return i;
          }
        }
        return 0;
    }
    public void solver(TreeNode root){
        if(root==null){
            return;
        }
        solver(root.left);
        set.add(root.val);
        solver(root.right);
    }
}