/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        int c=0;
        while(!q.isEmpty()){
            int q_size=q.size();
           List<Integer>li=new ArrayList<>();
           for(int i=0;i<q_size;i++){
           TreeNode temp=q.poll();
           li.add(temp.val);
           if(temp.left!=null){
            q.offer(temp.left);
            }
           if(temp.right!=null){
            q.offer(temp.right);
            }
           }
           if(c%2==0){
            res.add(li);
            c++;
           }
           else{
            Collections.reverse(li);
            res.add(li);
            c++;
           }
        }
        return res;
    }
}