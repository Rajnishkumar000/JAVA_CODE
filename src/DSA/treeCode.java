package DSA;

import java.util.Scanner;

class node{
    int data;
    node left;
    node right;

}

public class treeCode
{
    node root;
    static node  create(int data)
    {
        Scanner in=new Scanner(System.in);
        node n=new node();

        n.data=data;
        n.left=null;
        n.right=null;
        return n;
    }
    static void preorder(node root){
        if(root!=null)
        {
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(node root){
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"  ");
        }
    }
    static void inorder(node root){
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+"  ");
            inorder(root.right);

        }
    }

     static node  search(node root, int key){
    if(root==null){
        return null;
    }
    if(key==root.data){
        return root;
    }
    else if(key<root.data){
        return search(root.left, key);
    }
    else{
        return search(root.right, key);
    }
}





    public static void main(String[] args)
    {
        node p=create(10);
        node pl=create(8);
        node pr=create(12);
        node pll=create(7);
        node plr=create(9);
        node prl=create(11);
        node prr=create(13);

        //linking
        p.left=pl;
        p.right=pr;
        p.left.left=pll;
        p.left.right=plr;
        p.right.left=prl;
        p.right.right=prr;

        preorder(p);
        System.out.println();
        postorder(p);
        System.out.println();
        inorder(p);
        System.out.println();


        node f=search(p,14);
        if(f!=null)
            System.out.println("Found");
        else
            System.out.println("NOT Found");
    }
}
