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
    public int ans = 0, t=0;

    public void fun(TreeNode root){
        if(root == null){
            return;
        }

        fun(root.left);
        if(t > 0){
            t--;
            ans = root.val;
        }else{
            return;
        }
        fun(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        t = k;
        fun(root);
        return ans;
    }
}
