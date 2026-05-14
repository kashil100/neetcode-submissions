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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            ans = true;
            fun(temp, subRoot);
            if(ans){
                return true;
            }

            if(temp.left != null){
                stack.push(temp.left);
            }

            if(temp.right != null){
                stack.push(temp.right);
            }
        }

        return false;
    }
}
