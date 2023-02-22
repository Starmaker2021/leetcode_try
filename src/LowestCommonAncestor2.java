public class LowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) lowestCommonAncestor2(root.left, p, q);
        if (root.val > p.val && root.val > q.val) lowestCommonAncestor2(root.right, p, q);
        return root;
    }
}
