package RestartingIn2025;

// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

class priorityQ
{
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        p.add(10);
        p.add(20);
        p.add(15);
        System.out.println(p);


        // Printing the top element of PriorityQueue
        System.out.println(p.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(p.poll());

        // Printing the top element again
        System.out.println(p.peek());

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//        q.offer(3);
//        q.offer(1);
//        q.offer(4);
//        q.offer(2);
          q.add(3);
          q.add(1);
          q.add(4);
          q.add(2);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        q.add(1);
        System.out.println(q);

        q.add(5);
        System.out.println(q);
        q.add(6);
        q.add(7);
        q.add(12);
        q.add(13);
        q.add(11);
        q.add(10);
        q.add(8);
        q.add(9);
        System.out.println(q);






    }
}
