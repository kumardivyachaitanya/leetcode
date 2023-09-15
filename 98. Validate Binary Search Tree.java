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
    ArrayList<Integer>list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return false;
        }
        inorder(root);
        boolean isbst=true;
        int prev=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=prev){
                isbst=false;
            }
            prev=list.get(i);
        }
        return isbst;

    }
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
