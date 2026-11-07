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

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size(); // the for loop will go the length of the size of our curr level
            List<Integer> level = new ArrayList<>(); // to be added into our result array list

            for (int i = 0; i < levelSize; i++){

            TreeNode node = queue.poll(); // set node to next in queue
            level.add(node.val); //add val to level

        // this if-statement will add nodes current left child to the q  
        //to be processed later
            if(node.left != null){ 
                queue.offer(node.left);

            }
        // this if-statement will add nodes current right child to the q  
        //to be processed later
            if(node.right != null){
                queue.offer(node.right);
            }
        }

        //once queue the current level has been cleared add result 
        result.add(level);
    }

    return result;
    }
}
