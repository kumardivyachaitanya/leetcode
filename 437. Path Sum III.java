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
    int total=0;
    public int pathSum(TreeNode root, int targetSum){
        if(root==null){
            return 0;
        }
        findpathsum(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return total;


    }
    private void findpathsum(TreeNode curr,int targetsum,int currsum){
        if(curr==null){
            return;
        }
        currsum+=curr.val;
        if(currsum==targetsum){
            total++;

        }
        findpathsum(curr.left,targetsum,currsum);
        findpathsum(curr.right,targetsum,currsum);
    }
}
