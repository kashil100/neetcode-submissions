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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode temp = null;
            while(size > 0){
                temp = queue.poll();
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
                size--;
            }
            ans.add(temp.val);
        }

        return ans;
    }
}
