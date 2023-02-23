public class ConvertBST {
int sum = 0;
    public void convertBST1(TreeNode root) {
        if(root == null){
            return;
        }
        convertBST1(root.right);
        sum+= root.val;
        root.val = sum;
        convertBST1(root.left);
    }
}
