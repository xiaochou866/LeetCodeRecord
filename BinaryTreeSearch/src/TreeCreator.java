public class TreeCreator {
    public TreeNode createBinaryTree(){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        // 创建树中各个节点之间的关系
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right =node6;
        node4.left = node5;
        node6.left = node7;
        node7.left = node8;

        node3.left = node9;
        node3.right = node10;
        node10.left = node11;
        node10.right = node12;
        return  root;
    }
}
