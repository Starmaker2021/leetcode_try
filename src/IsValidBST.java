public class IsValidBST {
    TreeNode max;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        boolean left = isValidBST(root.left);

        if (!left) {
            return false;
        }
        if (max != null && max.val > root.val) {
            return false;
        }
        max = root;

        return isValidBST(root.right);
    }
}
