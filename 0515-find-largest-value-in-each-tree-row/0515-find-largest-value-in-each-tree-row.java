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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxValues = new ArrayList<>();
        if(root == null) return maxValues;

        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()) 
        {
            int size = q.size();
            int maxElement = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++)
            {
                TreeNode curr = q.remove();
                
                if(curr.left != null)
                    q.add(curr.left);

                if(curr.right != null)
                    q.add(curr.right);

                maxElement = Math.max(curr.val, maxElement);
            }
            maxValues.add(maxElement);
        }
        return maxValues;
    }
}