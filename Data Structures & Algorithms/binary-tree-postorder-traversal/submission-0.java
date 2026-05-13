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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<Integer> stackTemp = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            stackTemp.push(temp.val);
            if(temp.left != null){
                stack.push(temp.left);
            }

            if(temp.right != null){
                stack.push(temp.right);
            }
        }

        while(!stackTemp.isEmpty()){
            ans.add(stackTemp.pop());
        }

        

        return ans;
    }
}