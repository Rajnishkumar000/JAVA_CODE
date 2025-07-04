package RestartingIn2025;

public class LeetCodeQs
{
    public static boolean isHappy(int num){
        if(num == 1){
            return true;
        }
        if(num<=9){
            return false;
        }
        int sqr = 0;
        while(sqr!=1){
            int n = sqr==0?num:sqr;
            while (n!=0){
                sqr = (int) Math.pow(n%10,2);
                n/=10;

            }
            if((sqr<=9 && sqr!=1) || sqr == num){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }
}
