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
    int res = 0;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return res;
    }
    public void helper(TreeNode root, int num){
        num *= 10;
        num += root.val;
        if(root.left == null && root.right == null){
            res += num;
            return;
        }
        if(root.left != null){
            helper(root.left,num);
        }
        if(root.right != null){
            helper(root.right,num);
        }
    }
}
