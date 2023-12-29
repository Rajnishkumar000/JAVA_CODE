package CSW;

public class TOH
{
    static void tower(int n,char a,char b,char c){
        if(n<1) {
            return;
        }

        tower(n-1,a,c,b);
        System.out.println("move disk "+n+" from "+a+" to "+c);
        tower(n-1,b,a,c);

    }
    public static void main(String[] args) {
        int n=3;
        tower(n,'a','b','c');
    }
}
