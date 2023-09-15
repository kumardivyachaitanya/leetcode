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
    public int rob(TreeNode root) {
        int []option=travel(root);
        return Math.max(option[0],option[1]);
    }
    private int[] travel(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int left_node_choices[]=travel(root.left);
        int right_node_choices[]=travel(root.right);
        int option[]=new int[2];

        //when we consider the rood or loot the root house

        option[0]=root.val+left_node_choices[1]+right_node_choices[1];

        //when we are not choosing the root house

        option[1]=Math.max(left_node_choices[0],left_node_choices[1])+Math.max(right_node_choices[0],right_node_choices[1]);
        return option;
    }
}
