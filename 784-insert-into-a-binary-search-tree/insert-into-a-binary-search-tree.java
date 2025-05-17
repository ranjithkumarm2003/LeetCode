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
  
        if(val<root.val){
            if(root.left==null){
                TreeNode temp=new TreeNode(val);
                root.left=temp;
            }
           else root=insertIntoBST(root.left,val);
        }
        else if(val>root.val){
            if(root.right==null){
                TreeNode temp=new TreeNode(val);
                root.right=temp;                
            }
           else root=insertIntoBST(root.right,val);
        }

      
      return head;
    }
}