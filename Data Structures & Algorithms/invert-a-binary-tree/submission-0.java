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
    public void fun(TreeNode head){
        if(head == null){
            return;
        }

        TreeNode swap = head.left;
        head.left = head.right;
        head.right = swap;
        fun(head.left);
        fun(head.right);
    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = root;
        fun(temp);
        return root;
    }
}
