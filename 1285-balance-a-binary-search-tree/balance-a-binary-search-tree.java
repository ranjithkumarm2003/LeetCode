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
     List<Integer>li=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       sep(root);
       Collections.sort(li);
      
      return createBST(0,li.size()-1); 
    }
    public void sep(TreeNode root){
        if(root==null){
            return;
        }
        sep(root.left);
        li.add(root.val);
        sep(root.right);
    }
    public TreeNode createBST(int s,int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode res=new TreeNode(li.get(mid));
        res.left=createBST(s,mid-1);
         res.right=createBST(mid+1,e);
         return res;
    }

}