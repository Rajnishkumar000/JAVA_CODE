package BInaryTree;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class BinaryTree {
    public static TreeNode constructTree(Integer[] nodes) {
        if (nodes.length == 0 || nodes[0] == null) return null;
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < nodes.length) {
            TreeNode current = queue.poll();

            if (nodes[i] != null) {
                current.left = new TreeNode(nodes[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < nodes.length && nodes[i] != null) {
                current.right = new TreeNode(nodes[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    private static void inorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inorderHelper(root.left, result);
        result.add(root.val);
        inorderHelper(root.right, result);
    }

    public static List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    private static void preorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderHelper(root.left, result);
        preorderHelper(root.right, result);
    }

    public static List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }
    private static void postorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorderHelper(root.left, result);
        postorderHelper(root.right, result);
        result.add(root.val);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }

    public static int height(TreeNode root) {
        return (root == null) ? 0 : 1 + Math.max(height(root.left), height(root.right));
    }

    public static int countNodes(TreeNode root) {
        return (root == null) ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static boolean isBalanced(TreeNode root) {
        return checkBalance(root)[1] == 1;
    }
    private static int[] checkBalance(TreeNode root) {
        if (root == null) return new int[]{0, 1};
        int[] left = checkBalance(root.left);
        int[] right = checkBalance(root.right);
        boolean balanced = left[1] == 1 && right[1] == 1 && Math.abs(left[0] - right[0]) <= 1;
        return new int[]{Math.max(left[0], right[0]) + 1, balanced ? 1 : 0};
    }

    public static void main(String[] args) {
        Integer[] nodes = {1,2,2,3,3,null,null,4,4};
        System.out.println(Arrays.toString(nodes));
        TreeNode tree = constructTree(nodes);
        System.out.println("Is Balanced: " + isBalanced(tree));


        System.out.println("Inorder Traversal: " + inorder(tree));
        System.out.println("Preorder Traversal: " + preorder(tree));
        System.out.println("Postorder Traversal: " + postorder(tree));
        System.out.println("Level Order Traversal: " + levelOrder(tree));
        System.out.println("Height of Tree: " + height(tree));
        System.out.println("Total Nodes: " + countNodes(tree));
    }
}
