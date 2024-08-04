package Abstract_Class;

public class funcitonalinterface
{
    public static void main(String[] args) {


        //USES Labda function
        //1
        walkable w1=(int steps)->{
            System.out.println(steps);
            return steps;
        };

        w1.walks(5);
        w1.walks(7);
        //2
        walkable w2=(int steps)->steps*3;
        System.out.println(w2.walks(6));

        //3
        walkable w3=s->2*s;
        System.out.println(w3.walks(12));


    }
}
interface walkable
{
     int walks(int steps);
}
