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

    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer>list=new ArrayList<>();
        dfs(list,root);
        return list;
        
        

    }
    private void dfs(List<Integer>list,TreeNode root){
        if(root!=null){
            if(root.left!=null){
                dfs(list,root.left);
            }
            list.add(root.val);
            if(root.right!=null){
                dfs(list,root.right);
            }
        }
    }
    
    
}
