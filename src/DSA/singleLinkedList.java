package MyDSA;
import java.util.*;
class node{

    node next;
    int data;
}
public class singleLinkedList
{
    static node head;
    // CREATE
    static void create() {
        Scanner in = new Scanner(System.in);
        node a = new node();
        System.out.println("Input node value: ");
        a.data= in.nextInt();
        a.next = null;
        head = a;
        System.out.println("Do you want to add more nodes?(1/0):");
        int op = in.nextInt();
        while (op != 0) {
            node b = new node();
            System.out.println("Input node value: ");
            b.data = in.nextInt();
            a.next = b;
            a = b;
            System.out.println("Do you want to add more nodes? (1/0): ");
            op = in.nextInt();
        }
    }

    //ADD FIRST
    static void addFirst(){
        int decison=1;
        Scanner in=new Scanner(System.in);
        while(decison==1){
            node a=new node();
            System.out.println("Enter the data to add at first position");
            a.data=in.nextInt();
            a.next=head;
            head=a;
            System.out.println("Enter 1 to add 1 more else enter 0");
            decison=in.nextInt();
        }
    }

    //ADD LAST

    static void addLast(){

        Scanner in=new Scanner(System.in);
        node temp=head;
        node a=new node();
        System.out.println("Enter the no to add at last position");
        a.data= in.nextInt();
        a.next=null;
       while(temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next=a;



    }



    //DELETE FIRST
    static void deletefirst(){
        int decison=1;
        Scanner in=new Scanner(System.in);

        while(decison==1) {
            head = head.next;
            System.out.println("Enter 1 to delete 1 more else enter 0");
            decison=in.nextInt();

        }

    }

    //DELETE LAST
    static void deleteLast(){
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
        System.out.println("Value after deleting last node");
    }




 static void print(node head){

        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
     System.out.println("null");
}
   static node reverse()
   {
       node prev=null;
       node cur = head;
       node temp = null;
       while (cur != null) {
           temp = cur.next;
           cur.next = prev;
           prev = cur;
           cur = temp;
       }


       return prev;
   }

    public static void main(String[] args)
    {
        create();
        print(head);
        System.out.println();

//        deletefirst();
//        print(head);
//        System.out.println();
//
//        addFirst();
//        print(head);
//        System.out.println();
//
//        addLast();
//        print(head);
//        System.out.println();
//
//
//        deleteLast();
//        print(head);
//        System.out.println();

        node x=reverse();
        print(x);




    }
}
