import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(method(a));
    }
    static String method(int n){
        int count=0;
        String ans="";
        while (count<n){
            for (int i=1;i<Integer.MAX_VALUE;i++){
                ans="";
                int b=i;
                while (b>0){
                    ans+=b%2;
                    b=b/2;
                }
                if (!ans.contains("11")) count++;
                if (count>=n) return ans;
            }
        }
        return ans;
    }

}
