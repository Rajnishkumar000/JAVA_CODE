package KuchAlag;

public class swaping_easy {
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        x = (x * y) / (y = x);
        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
        }
    }

