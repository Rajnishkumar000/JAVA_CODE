package RestartingIn2025;

class TreeNode2 {
    int val;
    TreeNode2 left, right;
    public TreeNode2(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode2 root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode2 left, TreeNode2 right) {
        if (left == null && right == null) return true; // Both are null, so symmetric
        if (left == null || right == null) return false; // One is null, not symmetric
        if (left.val != right.val) return false; // Values do not match

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        // Example: root = [1,2,2,null,3,null,3]
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(2);
        root.left.right = new TreeNode2(3);
        root.right.right = new TreeNode2(3);

        System.out.println("Is the tree symmetric? " + isSymmetric(root));
    }
}
