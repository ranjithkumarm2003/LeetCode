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
    List<String>li=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
      solve(root,"");
      return li;
    }
    public void solve(TreeNode root,String str){
        
        
        if(root == null ){
         return;
        }
        str=str+root.val;
        if(root.left==null && root.right==null){
             li.add(str);
        }
        else{
         str=str+"->";
        solve(root.left,str);
        solve(root.right,str);
       
        }
    }
}