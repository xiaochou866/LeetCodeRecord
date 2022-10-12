import java.util.*;

public class PostOrder {

    public void traversal1(TreeNode root){
        if(root==null) return;
        traversal1(root.left);
        traversal1(root.right);
        System.out.print(root.val+" ");
    }

    public void traversal2(TreeNode root){
        // 后续遍历二叉树 左 右 根
        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                res.add(root.val);
                stack.push(root);
                root = root.right;
            }

            TreeNode cur = stack.pop();
            root = cur.left;
        }
        Collections.reverse(res);
        for(int val: res){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
