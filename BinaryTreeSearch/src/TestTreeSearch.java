import java.util.Deque;
import java.util.LinkedList;

public class TestTreeSearch {
    public static void main(String[] args) {
        TreeNode root = new TreeCreator().createBinaryTree();

        PreOrder preOrder = new PreOrder();
        System.out.println("使用递归的方法对该二叉树进行前序遍历结果为:");
        preOrder.traversal1(root);
        System.out.println("\n使用迭代的方法对该二叉树进行前序遍历结果为:");
        preOrder.traversal2(root);

        //PostOrder postOrder = new PostOrder();
        //System.out.println("\n使用递归的方法对该二叉树进行后序遍历结果为:");
        //postOrder.traversal1(root);
        //System.out.println("\n使用迭代的方式对该二叉树进行后序遍历结果为:");
        //postOrder.traversal2(root);

        //InOrder inOrder = new InOrder();
        //System.out.println("\n使用递归的方式对二叉树进行中序遍历结果为:");
        //inOrder.traversal1(root);
        //System.out.println("\n使用迭代的方式对二叉树进行中序遍历的结果为:");
        //inOrder.traversal2(root);
    }
}
