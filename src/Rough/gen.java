package Rough;

public class gen
{
    public <T> void printarray(T s[]){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args) {
        gen ob=new gen();
        String s[]=new String[]{"india","pakistan","china"};
        Integer i[]={12,23,34};
        ob.printarray(s);
        ob.printarray(i);


    }
}
