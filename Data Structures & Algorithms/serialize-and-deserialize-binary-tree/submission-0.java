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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        dfsSerialize(root, result);
        return result.toString();

    }

    private void dfsSerialize(TreeNode root, StringBuilder result) {
        if(root == null){
            result.append("N,");
            return;
        }

        result.append(root.val).append(",");

        dfsSerialize(root.left, result);
        dfsSerialize(root.right, result);

    
    }

    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] index = {0};

        return dfsDeserialize(values, index);
    }


    // Decodes your encoded data to tree.
    public TreeNode dfsDeserialize(String[] values, int[] index) {
            if(values[index[0]].equals("N")) {
                index[0]++;
                return null;
            }    

            TreeNode node = new TreeNode(Integer.parseInt(values[index[0]]));
    
            index[0]++;

            node.left = dfsDeserialize(values, index);
            node.right = dfsDeserialize(values, index);

            return node;
    }
}
