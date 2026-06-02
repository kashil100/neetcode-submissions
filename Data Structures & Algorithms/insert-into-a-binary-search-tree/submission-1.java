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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        TreeNode temp = root;
        while(temp!=null){
            if(temp.val < val){
                if(temp.right == null){
                    TreeNode sec = new TreeNode(val);
                    temp.right = sec;
                    break;
                }
                temp = temp.right;
            }else{
                if(temp.left == null){
                    TreeNode sec = new TreeNode(val);
                    temp.left = sec;
                    break;
                }
                temp = temp.left;
            }
        }

        return root;
    }
}