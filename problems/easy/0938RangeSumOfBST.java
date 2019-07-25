/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        return compare(root,L,R);
    }
    
    private int compare(TreeNode root,int L,int R){
        if(root == null) return 0;
        else{
            if(root.val<=R && root.val>=L){
            return root.val+compare(root.left,L,R) + compare(root.right,L,R); 
        }else{
            return compare(root.left,L,R) + compare(root.right,L,R);
        }
    }
    }
}
