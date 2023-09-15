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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Stack<TreeNode>path=new Stack<>();
        Stack<Integer>pathvalue=new Stack<>();
        path.add(root);
        pathvalue.add(root.val);
        while(!path.isEmpty()){
            TreeNode tempnode=path.pop();
            int temppathvalue=pathvalue.pop();
            if(tempnode.left==null&&tempnode.right==null&&temppathvalue==targetSum){
                return true;
            }
            if(tempnode.right!=null){
                path.push(tempnode.right);
                pathvalue.push(tempnode.right.val+temppathvalue);
            }
            if(tempnode.left!=null){
                path.push(tempnode.left);
                pathvalue.push(tempnode.left.val+temppathvalue);
            }

        }
        return false;
    }
}
