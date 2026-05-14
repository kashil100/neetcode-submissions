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
    public boolean ans = true;
    public void fun(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return;
        }
        if(q==null || p==null || p.val != q.val){
            ans = false;
        }

        if(!ans){
            return;
        }

        fun(p.left, q.left);
        fun(p.right, q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        fun(p,q);
        return ans;
    }
}
