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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String maintree=preordertraversal(root);
        String subtree=preordertraversal(subRoot);
        return (maintree.contains(subtree));
    }
    private String preordertraversal(TreeNode root){
        StringBuilder sb=new StringBuilder("^");
        if(root==null){
            return "null";
        }
        sb.append(root.val);
        sb.append(preordertraversal(root.left));
        sb.append(preordertraversal(root.right));

        return sb.toString();
    }
}
