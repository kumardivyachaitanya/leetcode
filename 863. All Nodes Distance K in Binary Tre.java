/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        HashMap<TreeNode,TreeNode>map=new HashMap<>();
        findparent(map,root);
        Queue<TreeNode>q=new LinkedList<>();
        HashSet<TreeNode>visited=new HashSet<>();
        q.add(target);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                visited.add(curr);
                if(k==0){
                    result.add(curr.val);
                }
                if(map.containsKey(curr)&&!visited.contains(map.get(curr))){
                    q.add(map.get(curr));
                }
                if(curr.left!=null&&!visited.contains(curr.left)){
                    q.add(curr.left);
                }
                if(curr.right!=null&&!visited.contains(curr.right)){
                    q.add(curr.right);
                }
            }
            k--;
            if(k<0){
                break;
            }
        }
        return result;

    }
    private void findparent(HashMap<TreeNode,TreeNode>map,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            map.put(root.left,root);
        }
        if(root.right!=null){
            map.put(root.right,root);
        }
        findparent(map,root.left);
        findparent(map,root.right);
    }
}
