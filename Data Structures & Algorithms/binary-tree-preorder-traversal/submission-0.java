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
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode temp = root;
        List<Integer> ans = new ArrayList<>();

        while(!stack.isEmpty() || temp!=null){
            while(temp!=null){
                ans.add(temp.val);
                stack.push(temp);
                temp = temp.left;
            }

            temp = stack.pop();
            // ans.add(temp.val);
            temp = temp.right;
        }

        return ans;
    }
}