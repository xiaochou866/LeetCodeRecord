import java.util.Deque;
import java.util.LinkedList;

public class InOrder {

    public void traversal1(TreeNode root){
        if(root ==null) return;
        traversal1(root.left);
        System.out.print(root.val+" ");
        traversal1(root.right);
    }

    public void traversal2(TreeNode root){
        Deque<TreeNode> stack = new LinkedList<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            TreeNode cur = stack.pop();
            System.out.print(cur.val+" ");
            root = cur.right;
        }
    }
}
