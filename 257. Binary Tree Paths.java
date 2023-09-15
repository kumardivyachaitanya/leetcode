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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        String currpath=Integer.toString(root.val);
        if(root.left==null&&root.right==null){
            result.add(currpath);
        }
        if(root.left!=null){
            dfs(result,currpath,root.left);
        }
        if(root.right!=null){
            dfs(result,currpath,root.right);
        }
        return result;

    }
    private void dfs(List<String>result,String currpath,TreeNode node){
        currpath+="->"+node.val;
        if(node.left==null&&node.right==null){
            result.add(currpath);
            return;
        }
        if(node.left!=null){
            dfs(result,currpath,node.left);
        }
        if(node.right!=null){
            dfs(result,currpath,node.right);
        }

    }
}
