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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x = p.val;
        int y = q.val;
        while(root!=null){
            int a = root.val;
            if((a<=x && a>=y) || (a<=y && a>=x)){
                return root;
            }else if(a<x && a<y){
                root = root.right;
            }else{
                root = root.left;
            }
        }

        return p;
        
    }
}
