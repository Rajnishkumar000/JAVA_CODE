package outputquestion;

public class multithreadingka extends Thread {
    public static void main(String[] args) {
        multithreadingka t=new multithreadingka();
        Thread t1=new Thread(t);
        t.run();


    }
    public  void run()
    {
        System.out.println(1);
    }
}
