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
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode,Integer>map=new HashMap<>();
        Stack<TreeNode>stk=new Stack<>();
        int diameter=0;
        if(root!=null){
            stk.push(root);
        }
        while(!stk.isEmpty()){
            TreeNode node=stk.peek();
            if(node.left!=null&&!map.containsKey(node.left)){
                stk.add(node.left);
            }
            else if(node.right!=null&&!map.containsKey(node.right)){
                stk.add(node.right);
            }
            else{
                stk.pop();
                int rightdepth=map.getOrDefault(node.right,0);
                int leftdepth=map.getOrDefault(node.left,0);
                map.put(node,1+Math.max(rightdepth,leftdepth));
                diameter=Math.max(diameter,rightdepth+leftdepth);
            }
        }
        return diameter;

    }
}
