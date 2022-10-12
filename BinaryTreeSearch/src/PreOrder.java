import java.util.Deque;
import java.util.LinkedList;

public class PreOrder {
    public void traversal1(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        traversal1(root.left);
        traversal1(root.right);
    }

    public void traversal2(TreeNode root){
        // 前序遍历二叉树 根 左 右
        Deque<TreeNode> stack = new LinkedList<>();
        while(root!=null || !stack.isEmpty()){
            while (root!=null){
                System.out.print(root.val+" ");
                stack.push(root);
                root = root.left;
            }

            TreeNode cur = stack.pop();
            root = cur.right;
        }
        System.out.println();
    }
}
