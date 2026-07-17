// Last updated: 7/17/2026, 11:55:58 PM
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
       if(root==null){
            return 0;
       }
       if(root.val<low){
        return rangeSumBST(root.right,low,high);
       }
       if(root.val>high){
         return rangeSumBST(root.left,low,high);
       }
       return root.val
                +rangeSumBST(root.left,low,high)
                +rangeSumBST(root.right,low,high);
       }
       }