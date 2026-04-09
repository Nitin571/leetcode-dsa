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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ls;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                ls.add(new ArrayList<>(ans));
                ans.clear();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                ans.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        int i=0,j=ls.size()-1;
        while(i<j){
            List<Integer> temp = ls.get(i);
            ls.set(i,ls.get(j));
            ls.set(j,temp);
            i++;
            j--;
        }
        return ls;
    }
}