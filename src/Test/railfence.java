package Test;

public class railfence {
    public static String encryptionRainfence(String s,int k)
    {
        String str="";
        int n=2*(k-1)-1;
        int temp=n;
        int len=s.length();
        int p=0;
        int t=k;
        for(int i=0;i<k;i++)
        {

            if(p>=0) {
                for (int j = i; j < len; j = j + n + 1) {
                    int f=j;


                    if(j%2==1)
                    {
                        j=n-1;
                        j=j-2;

                    }
                    if(j>=0) {
                        str = str + s.charAt(j);
                        j = f;
                    }

                }
                n = n - 2;
                p = n;
            }
        }


        for (int j = t-1; j < len; j = j + temp + 1) {
            str = str + s.charAt(j);
        }


        return str;
    }

    public static void main(String args[])
    {
        String s="RajnishKumar";
        int k=3;

        System.out.print(encryptionRainfence(s,k));
    }
}
