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
    public TreeNode helper(int nums[],int si,int ei){
        if(si>ei){
            return null;
        }
       int maxindex = si;
       for(int i = si;i<=ei;i++){
            if(nums[i] > nums[maxindex]){
                maxindex = i;
            }
       }

       TreeNode root = new TreeNode(nums[maxindex]);
       root.left = helper(nums,si,maxindex-1);
       root.right = helper(nums,maxindex+1,ei);

       return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}