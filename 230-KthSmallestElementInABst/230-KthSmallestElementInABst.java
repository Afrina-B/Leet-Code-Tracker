// Last updated: 7/17/2026, 11:57:14 PM
class Solution {
    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        inorder(node.left, k);

        count++;
        if (count == k) {
            ans = node.val;
            return;
        }

        inorder(node.right, k);
    }
}