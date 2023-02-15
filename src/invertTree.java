import java.util.ArrayDeque;

public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            while(size-->0){
                TreeNode node = deque.poll();
                swapNode(node);
                if(node.left!=null)deque.offer(node.left);
                if(node.right!=null)deque.offer(node.right);
            }
        }
    }
    public void swapNode(TreeNode node){
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }
}
