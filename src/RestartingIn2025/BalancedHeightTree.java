package RestartingIn2025;


import java.util.*;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val)
    {
        this.val=val;
    }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }


}
public class BalancedHeightTree {
    public static TreeNode1 constructTree(Integer[] nodes) {
        if (nodes.length == 0 || nodes[0] == null)
            return null;
        TreeNode1 root = new TreeNode1(nodes[0]);
        Queue<TreeNode1> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < nodes.length) {
            TreeNode1 current = queue.poll();

            if (nodes[i] != null) {
                current.left = new TreeNode1(nodes[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < nodes.length && nodes[i] != null) {
                current.right = new TreeNode1(nodes[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }



    public static boolean isBalanced(TreeNode1 root)
    {
        return checkBalanced(root)[1]==1;
    }

    private static int[] checkBalanced(TreeNode1 root) {
        if(root==null)
        {
            return new int[]{0,1};
        }
        int left[]=checkBalanced(root.left);
        int right[]=checkBalanced(root.right);
        boolean balanced = left[1]==1 && right[1]==1 && Math.abs(left[0]-right[0])<=1;
        return new int[]{Math.max(left[0],right[0])+1,balanced?1:0};
    }


    public  static void main(String args[])
    {
        Integer arr[]={3,9,20,null,null,15,7};
        TreeNode1 tree = constructTree(arr);
//        System.out.println(tree.val);
//        System.out.println(tree.left.val);
//        System.out.println(tree.right.val);
//        System.out.println(tree.right.left.val);
//        System.out.println(tree.right.right.val);
        System.out.println(isBalanced(tree));

    }
}

