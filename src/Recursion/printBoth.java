package Recursion;

 class printBoth
{
    static void  printt(int n)
    {
        if(n==0)
            return;

        System.out.println(n);
        printt(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        printt(5);
        int s=12304567;
        int dig=(int)Math.log10(s)+1;
        double ex=Math.exp(0.0);
        System.out.println(dig);

    }
}
