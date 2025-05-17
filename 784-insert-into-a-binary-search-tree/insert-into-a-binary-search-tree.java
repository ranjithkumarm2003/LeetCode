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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
      TreeNode head=root;
      while(true){
        if(val<root.val){
            if(root.left==null){
                TreeNode temp=new TreeNode(val);
                root.left=temp;
                break;
            }
            root=root.left;
        }
        else if(val>root.val){
            if(root.right==null){
                TreeNode temp=new TreeNode(val);
                root.right=temp;
                break;
            }
            root=root.right;
        }

      }
      return head;
    }
}