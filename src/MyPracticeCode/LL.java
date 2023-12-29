package MyPracticeCode;
/*
Name :Riya Rana
Regd_N0:2141018047
section:11
subject:DSA
 */

//Problem Definition: To create a Singly Linked List and perform different operations on it.
import java.util.*;
class LL {
    public class Node {
        int info;
        Node link;
        Node() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter info : ");
            info = sc.nextInt();
            link = null;
        }
    }
    static Node start;
    void create() {
        char ch;
        do {
            Scanner sc = new Scanner(System.in);
            Node newNode = new Node();
            Node point = start;
            if(start == null) {
                start = newNode;
            }
            else {
                while(point.link != null) {
                    point = point.link;
                }
                point.link = newNode;
            }
            System.out.println("Do you want to create another node(y/n) :");
            ch = sc.next().charAt(0);
        }
        while(ch != 'n');
    }
    void display() {
        Node point = start;
        System.out.println("Displaying the List-->");
        while(point != null) {
            System.out.print(point.info+"-->");
            point = point.link;
        }
        System.out.println("NULL");
        System.out.println();
        System.out.println();
    }
    int find2ndMax() {
        Node point = start.link;
        int max1 = start.info;
        int max2 = -1;
        while(point != null) {
            if(max1 < point.info) {
                if(max2 < max1) {
                    max2 = max1;
                }
                max1 = point.info;
            }
            else {
                if(point.info > max2 && point.info != max1) {
                    max2 = point.info;
                }
            }
            point = point.link;
        }
        if(max1 == max2) {
            return -1;
        }
        return max2;
    }
    void search(int n) {
        int count = 1;
        if(start == null) {
            System.out.println("The list is empty.....");
        }
        else  {
            Node point = start;
            while(point != null) {
                if(n == point.info) {
                    System.out.println("The number is at "+count+"th node.");

                }
                count++;
                point = point.link;
            }

        }
    }

    void removeDuplicate() {
        int t;
        Node p = start, q;
        while(p != null) {
            q = p.link;
            while(q != null) {
                if(p.info > q.info) {
                    t = p.info;
                    p.info = q.info;
                    q.info = t;
                }
                q = q.link;
            }
            p = p.link;
        }
        p = start;
        while(p.link!=null)	{
            if(p.link.info==p.info) {
                q = p.link;
                p.link = q.link;
                q.link = null;
                if(p.link == null)
                    break;
                if(p.info==p.link.info)
                    continue;
            }
            p = p.link;
        }
    }
    void countUniqueNode() {
        removeDuplicate();
        int count = 0;
        if(start == null) {
            System.out.println("The list is empty.....");
        }
        else {
            Node point = start;
            while(point != null) {
                count++;
                point = point.link;
            }
            System.out.println("The number of unique nodes in the list is "+count);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LL ob = new LL();

        while(true) {
            System.out.println("***MENU***");
            System.out.println("0:Exit :");
            System.out.println("1:Creation :");
            System.out.println("2:Display:");
            System.out.println("3:Find 2nd Max Number:");
            System.out.println("4:Search:");
            System.out.println("5:Remove Duplicate Number:");
            System.out.println("6:Count Unique Node :");
            System.out.println("Enter the choice :---      ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    ob.create();
                    break;
                case 2:
                    ob.display();
                    break;
                case 3:
                    if(ob.find2ndMax() == -1) {
                        System.out.println("There is no 2nd max number is the list..");
                    }
                    else {
                        System.out.println("The 2nd max number is "+ob.find2ndMax());
                    }
                    break;
                case 4:
                    System.out.println("Enter a number to search :");
                    ob.search(sc.nextInt());
                    break;
                case 5:
                    ob.removeDuplicate();
                    ob.display();
                    break;
                case 6:
                    ob.countUniqueNode();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }

}
