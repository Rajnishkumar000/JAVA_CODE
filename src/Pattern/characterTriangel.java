package Pattern;

public class characterTriangel
{
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print('A');
            }
            System.out.println();
        }
        System.out.println();



        for(int i=0;i<n;i++)
        {
            char c='A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(c);
                c+=1;
            }
            System.out.println();
        }
        System.out.println();



        char c='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c);
                c+=1;
            }
            System.out.println();
        }
    }
}
