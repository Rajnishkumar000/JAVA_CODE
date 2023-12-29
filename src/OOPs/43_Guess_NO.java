package OOPs;
import java.util.Random;
import java.util.Scanner;
class play
{
   int n,num,nog,rand;
    private String name;
    public play()
    {
        Random in = new Random();
        this.n = in.nextInt(100);
    }
    int passnum()
    {
        return n;
    }
    public String GetName()
    {
        return name;
    }
    public void SetName(String nm)
    {
        this.name = nm;
    }
    void takeuserinput(int yc)
    {
        this.num = yc;
    }
    int iscorrect()
    {
         if(num<n)
        {
            System.out.format("You have choose %d which is less than Original number\n", num);
        }
        else{
            System.out.format("You have choose %d which is greater than Original number\n",num);
        }
        return n;
    }
    int GetMumberofGuess()
    {
        return nog;
    }
    void SetNumberofGuess(int c)
    {
        this.nog= c;
    }

}
class Guess_NO43
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c =1;
        play Aditya = new play();
        System.out.print("Enter your Name: ");
        String nm = in.nextLine();
        Aditya.SetName(nm);
        System.out.println("Welcome " + Aditya.GetName());
        int cc = Aditya.passnum();
        while (true)
        {
            System.out.println("Guess number between 1 and 100");
            int n = in.nextInt();
            if(n==cc)
            {
                    System.out.format("You have choose %d which is correct!\n",n);
                break;
            }
            Aditya.takeuserinput(n);
            Aditya.iscorrect();
            c+=1;
            Aditya.SetNumberofGuess(c);
        }
        System.out.println("You have guess the number in "+Aditya.GetMumberofGuess()+" Attempt");
    }
}
