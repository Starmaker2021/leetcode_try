public class HasPathSum {
    public boolean haspathsum(TreeNode root, int targetsum) {
        if (root == null) {
            return false;
        }
        targetsum -= root.val;
        if(root.left ==null&&root.right== null){
            return targetsum == 0;
        }
        if(root.left != null){
            boolean left = haspathsum(root, targetsum);
            if(left){
                return true;
            }
        }
        if(root.right!=null){
            boolean right = haspathsum(root, targetsum);
            if (right){
                return true;
            }
        }
        return false;
    }
}
