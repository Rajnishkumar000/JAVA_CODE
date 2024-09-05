package Linkedlists;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class creating {
    Node head=null;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);

        if(head==null) {
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node temp;

        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        head=prev;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        creating list = new creating();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(0);
        list.print();
        list.reverse();
        list.print();

    }
}