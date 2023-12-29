package OOPs;
class Employee
{
    int id,salary;
    String name;
    public void printdetails()
    {
        System.out.println("My name is "+name);
        System.out.println("My id is "+id);

    }

    public int getSalary() {
        return salary;
    }
}
class creatingOwnJavaClass38
{
    public static void main(String[] args)
    {
        Employee psr=new Employee(); //Instatiating a new object
        Employee AJ=new Employee(); //Instatiating a new object
        //setting Attributes:
        psr.id=12;
        psr.salary=75000;
        psr.name="Aditya";

        AJ.id=4506987;
        AJ.salary=120000;
        AJ.name= "Prince";
        AJ.printdetails();
        psr.printdetails();
        int salary= AJ.getSalary();
        System.out.println("My salary is "+salary);
//        System.out.println(psr.id);
//        System.out.println(psr.name);
    }

}
