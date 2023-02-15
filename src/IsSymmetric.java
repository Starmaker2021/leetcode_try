public class IsSymmetric {
    public boolean isSymmetric1(TreeNode root) {
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }

        if (left == null && right == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        boolean comparableOutside = compare(left.left,right.right);
        boolean comparableInside = compare(left.right,right.left);

        return comparableInside&&comparableOutside;
    }
}
