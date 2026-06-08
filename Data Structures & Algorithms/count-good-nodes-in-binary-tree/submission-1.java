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
    public int ans = 0;

    public void fun(TreeNode root, int maxVal){
        if(root == null){
            return;
        }
        maxVal = Math.max(maxVal, root.val);
        fun(root.left, maxVal);
        if(maxVal <= root.val){
            ans++;
        }
        fun(root.right, maxVal);
    }

    public int goodNodes(TreeNode root) {
        fun(root, -1000);
        return ans;
    }
}
