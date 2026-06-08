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
    public int ans = 0;
    public List<Integer> list;

    public void fun(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        fun(root.left);
        int j = list.size()-1;
        ans++;
        for(int i = list.size()-2;i>=0;i--){
            if(list.get(j) < list.get(i)){
                ans--;
                break;
            }
        }
        fun(root.right);
        list.remove(list.size()-1);
    }

    public int goodNodes(TreeNode root) {
        list = new ArrayList<>();
        fun(root);
        return ans;
    }
}
