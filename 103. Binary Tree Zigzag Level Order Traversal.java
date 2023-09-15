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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        
        Queue<TreeNode>q=new LinkedList<>();
        
        boolean flag=false;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            Stack<Integer>stack=new Stack<>();
            ArrayList<Integer>list1=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(flag){
                    stack.push(curr.val);
                }
                else{
                    list1.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }


            }
            flag=!flag;
            while(!stack.isEmpty()){
                list1.add(stack.pop());
            }
            list.add(list1);
        }
        return list;
    }
}v
