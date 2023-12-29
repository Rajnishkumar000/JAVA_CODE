//package CSW;
//class Nodes {
//    int data;
//    Node left, right;
//
//    public Nodes(int item) {
//        data = item;
//        left = right = null;
//    }
//}
//
//class BST {
//    Node root;
//
//    BST() {
//        root = null;
//    }
//
//    void insert(int data) {
//        root = insertNode(root, data);
//    }
//
//    Node insertNode(Node root, int data) {
//        if (root == null) {
//            return new Node(data);
//        }
//
//        if (data < root.data) {
//            root.left = insertNode(root.left, data);
//        } else {
//            root.right = insertNode(root.right, data);
//        }
//
//        return root;
//    }
//
//    void delete(int data) {
//        root = deleteNode(root, data);
//    }
//
//    Node deleteNode(Node root, int data) {
//        if (root == null)
//            return root;
//
//        if (data < root.data) {
//            root.left = deleteNode(root.left, data);
//        } else if (data > root.data) {
//            root.right = deleteNode(root.right, data);
//        } else {
//            if (root.left == null)
//                return root.right;
//            else if (root.right == null)
//                return root.left;
//
//            root.data = minValue(root.right);
//            root.right = deleteNode(root.right, root.data);
//        }
//
//        return root;
//    }
//
//    int minValue(Node root) {
//        int minValue = root.data;
//        while (root.left != null) {
//            minValue = root.left.data;
//            root = root.left;
//        }
//        return minValue;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
//
//        BST bst = new BST();
//        for (int i = 0; i < arr.length; i++) {
//            bst.insert(arr[i]);
//        }
//
//        System.out.println("Binary Search Tree:");
//        inorderTraversal(bst.root);
//
//        int nodeToDelete = 6;
//        bst.delete(nodeToDelete);
//
//        System.out.println("\nBinary Search Tree after deleting node " + nodeToDelete + ":");
//        inorderTraversal(bst.root);
//    }
//
//    static void inorderTraversal(Node root) {
//        if (root != null) {
//            inorderTraversal(root.left);
//            System.out.print(root.data + " ");
//            inorderTraversal(root.right);
//        }
//    }
//}
//
