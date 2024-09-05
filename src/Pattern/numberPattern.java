package Pattern;

public class numberPattern {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++)
        {

            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }



            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            for (int j = i-1; j>=0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
