package rough;

public class evenOddUsingbwise
{
    public static void main(String[] args) {
        int number = 11; // You can replace this with any integer you want to check


        if ((number & 1) == 0)
        {
            System.out.println(number + " is even.");
        } else
        {
            System.out.println(number + " is odd.");
        }
        System.out.println(number & 1);
    }
}



