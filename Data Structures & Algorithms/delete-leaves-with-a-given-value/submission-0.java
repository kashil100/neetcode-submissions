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
    private boolean say = false;
    public void fun(TreeNode root, int target){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && root.val == target){
            say = true;
            return;
        }

        fun(root.left,target);
        if(say){
            root.left = null;
            if(root.left == null && root.right == null && root.val == target){
                return;
            }
            say = false;
        }
        fun(root.right, target);
        if(say){
            root.right = null;
            if(root.left == null && root.right == null && root.val == target){
                return;
            }
            say = false;
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        fun(root, target);
        return (say)?null:root;
    }
}