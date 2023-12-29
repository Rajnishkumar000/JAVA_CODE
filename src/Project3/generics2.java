package genee;

//write a program which contain a generic class a constructor and a generic method


class genericss <T extends Number>
{
    T a,b;
    int k;
    public  genericss(T a ,T b){
        this.a=a;
        this.b=b;
    }

    public  int sum()
    {

        if(a instanceof Integer && b instanceof Integer)
        {
            k =  a.intValue()+b.intValue();
            System.out.println(k);
        }
        else
        {
            System.out.println(a.toString()+b.toString());
        }
        return 0;


    }
}
public class generics2
{
    public static void main(String args[]) {
        genericss<Integer> obj=new  genericss<Integer>(2,3);
        obj.sum();

    }



}



