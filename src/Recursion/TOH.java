package Recursion;

public class TOH
{
    public static void towerOFHanoi(int n,int src,int dest,int temp)
    {
        if(n<1)
        {
            return;
        }
        towerOFHanoi(n-1,src,temp,dest);
        System.out.println("move disc "+n+" from rod "+(char)src+" to "+(char)dest);
        towerOFHanoi(n-1,temp,dest,src);
    }

    public static void main(String[] args) {
        towerOFHanoi(3,'A','C','B');
    }
}
