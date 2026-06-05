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
    public TreeNode fun(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }

        return root;
    }


    public TreeNode sec(TreeNode left, TreeNode right){
        if(right==null){
            return left;
        }
        else if(left == null){
            return right;
        }
        TreeNode temp = fun(right);
        temp.left = left;
        return right;
    }


    public TreeNode deleteNode(TreeNode root, int val) {
        if(root==null){
            return root;
        }

        TreeNode temp = root;
        TreeNode prev = root;
        while(temp!=null){
            if(temp.val == val){
                TreeNode ans = sec(temp.left, temp.right);
                if(temp == prev){
                    return ans;
                }
                
                if(temp == prev.left){
                    prev.left = ans;
                }else{
                    prev.right = ans;
                }
                
                return root;
            }
            
            prev = temp;
            if(temp.val < val){
                temp = temp.right;
            }else{
                temp = temp.left;
            }
        }

        return root;
    }
}