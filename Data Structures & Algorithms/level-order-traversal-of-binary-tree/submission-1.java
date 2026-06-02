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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = queue.size();
            while(n>0){
                TreeNode sec = queue.poll();
                temp.add(sec.val);
                if(sec.left!=null){
                    queue.offer(sec.left);
                }

                if(sec.right!=null){
                    queue.offer(sec.right);
                }
                n--;
            }

            ans.add(temp);
        }

        return ans;
    }
}
