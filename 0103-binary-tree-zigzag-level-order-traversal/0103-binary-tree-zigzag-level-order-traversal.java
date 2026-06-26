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
        List<List<Integer>> res = new ArrayList<>();

        if (root == null)
            return res;
        levelorder(root, res);
        return res;
    }

    public static void levelorder(TreeNode node , List<List<Integer>> result){
        if(node == null) return ;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);
        boolean ltr = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();

            for(int i = 0 ; i < size ;i++){
                TreeNode temp = q.poll();
            if (ltr) {
                li.addLast(temp.val);
            } else {
                li.addFirst(temp.val);
            }

            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
            }
            result.add(li); 
            ltr = !ltr;
            
        }
        
        
    }

}