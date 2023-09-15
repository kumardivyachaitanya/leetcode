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
        if(root==null){
            return 0;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int nooflevels=-1;
        while(true){
            int numofcount=q.size();
            if(numofcount==0){
                return nooflevels+1;
            }
            while(numofcount>0){
                TreeNode element=q.poll();
                if(element.left!=null){
                    q.add(element.left);
                }
                if(element.right!=null){
                    q.add(element.right);
                }
                numofcount--;
            }
            nooflevels++;
        }
    }
}
