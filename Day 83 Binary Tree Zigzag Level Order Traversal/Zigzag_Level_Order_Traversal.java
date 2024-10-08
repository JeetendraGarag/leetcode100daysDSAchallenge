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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        List<Integer> curans= new ArrayList<>();

        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        int level=0;
        main.push(root);
        while(main.size()>0){
            TreeNode curNode= main.pop();
            curans.add(curNode.val);

            if(level == 0){
                if(curNode.left != null){
                    helper.push(curNode.left);
                }
                if(curNode.right != null){
                    helper.push(curNode.right);
                }
            }else{
                  if(curNode.right != null){
                    helper.push(curNode.right);
                }
                 if(curNode.left != null){
                    helper.push(curNode.left);
                }
            }
            if(main.size() == 0){
                ans.add(curans);
                curans = new ArrayList<>();
                level = 1-level;

                main = helper;
                helper = new Stack<>();
            }
        }
        return ans;
    }
}