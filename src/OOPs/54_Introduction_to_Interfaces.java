package OOPs;
/*
Remember: Abstract classes ke ander minimum ek abstract method hona chahiye
aur sath me kitne v non-abstract method ho sakte h. But in case of
 Interface, there is only abstract method .i.e there is no any method which is not abstract.
*/

/*
Interfaces in english :
 Interfaces in english is a point where two system meet and interact.
for example : T.v <-----> (buttons)  Human. (Human interact tv through buttons).
*/

/*
Interface in java:
In java, interface is a group of related methods with empty bodies.
for example :
interface Bicycle {
void applyBracke(int decrement);
void speedup(int increment);}

// In case of interfaces, implement keyword is used in place of extend keyword for inheritance:
class AvonCycle implement Bicycle
{
int speed = 7;
void applyBracke (int decrement){
 speed = speed-decrement ;
 }
 }
*/
interface Bicycle
{
    // here keep remember that we not need to declare methods of interfaces as abstract.
    void applyBracke(int decrement);

    void speedup(int increment);
}
class AvonCycle implements Bicycle
    {
    int speed = 7;
    public void applyBracke(int decrement){
        speed = speed-decrement ;
    }
    public void speedup(int increment)
    {
        int speed = 20;
    }
}