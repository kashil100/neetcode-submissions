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
    private int count = 0;

    private boolean fun(TreeNode root, int a, int b){
        if(root == null){
            return true;
        }
        if(root.val <= a || root.val >= b){
            return false;
        }

        if(!fun(root.left, a, Math.min(b,root.val)) || !fun(root.right,Math.max(a,root.val),b)){
            return false;
        }

        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return fun(root, -1001, 1001);
    }
}
