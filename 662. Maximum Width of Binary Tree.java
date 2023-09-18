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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Deque<TreeNode>dq=new LinkedList<>();
        
        int max=1;
        dq.add(root);
        
        while(!dq.isEmpty()){
            while(!dq.isEmpty()&&dq.getFirst()==null){
                dq.removeFirst();
            }
            while(!dq.isEmpty()&&dq.getLast()==null){
                dq.removeLast();
            }
            max=Math.max(max,dq.size());
            int size=dq.size();
            for(int i=0;i<size;i++){
                TreeNode curr=dq.poll();
                if(curr==null){
                    dq.add(null);
                    dq.add(null);
                }
                else{
                    dq.add(curr.left);
                    dq.add(curr.right);
                }

            }

        }
        return max;
    }
}
