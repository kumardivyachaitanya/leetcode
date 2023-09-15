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
    public TreeNode invertTree(TreeNode root) {
        //inorder traversal approach
        Queue<TreeNode>q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;

            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
            
        }
        return root;
    }
}

//         //recursive approach
//         if(root==null){
//             return null;
//         }
//         TreeNode leftside=invertTree(root.left);
//         TreeNode rightside=invertTree(root.right);

//         root.left=rightside;
//         root.right=leftside;

//         return root;
//     }
// }
