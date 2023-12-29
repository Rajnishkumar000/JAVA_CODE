package CSW;
//Name:Rajnish Kumar
//Reg no:2141011103
//Sec:K

public class binarySearchTre
{
   static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
        }
    }



    public static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static node insert(node root, int val)
    {
        if(root==null)
        {
            root=new node(val);
            return root;

        }
        if(root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void findMinMax(node root)
    {
        node min=root;
        node max=root;

        while(min.left!=null)
        {
            min=min.left;
        }
        while(max.right!=null)
        {
            max=max.right;
        }
        System.out.println("Smallest element is "+min.data);
        System.out.println("Greatest element is "+max.data);

    }
    public static boolean search(node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data>key)
        {
            return search(root.left,key);
        }
        else if(root.data==key)
        {
            return true;
        }
        else {
            return search(root.right,key);
        }

    }
    public static node delete(node root ,int val)
    {
        if(root.data>val)
        {
            root.left=delete(root.left,val);
        }
        else if(root.data<val)
        {
            root.right=delete(root.right,val);
        }
        else {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            node iS=inorderSuccessor(root.right);
            root.data=iS.data;
            root.right=delete(root.right, iS.data);
        }
        return root;
    }
    public static node inorderSuccessor(node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }



    public static void main(String args[])
    {
        int values[]={5,1,4,3,2,7};
        node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        findMinMax(root);

        if(search(root,1))
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
        delete(root,1);
        System.out.println("After deleting a element,Element in Tree left is");
        inorder(root);
    }
}
