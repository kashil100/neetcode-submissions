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
            TreeNode left = temp.left;
            TreeNode right = temp.right;
            if(temp.val == val){
                if(temp == prev){
                    return sec(left, right);
                }
                if(left == null && right == null){
                    if(prev.left == temp){
                        prev.left = null;
                    }else if(prev.right == temp){
                        prev.right = null;
                    }
                }else if(left == null){
                    if(prev.left == temp){
                        prev.left = right;
                    }else if(prev.right == temp){
                        prev.right = right;
                    }
                }else if(right == null){
                    if(prev.left == temp){
                        prev.left = left;
                    }else if(prev.right == temp){
                        prev.right = left;
                    }
                }else{
                    if(prev.left == temp){
                        prev.left = right;
                    }else if(prev.right == temp){
                        prev.right = right;
                    }
                    TreeNode t = fun(right);
                    t.left = left;
                }
                
                return root;
            }
            
            prev = temp;
            if(temp.val < val){
                temp = right;
            }else{
                temp = left;
            }
        }

        return root;
    }
}