package DSA;
import java.util.HashSet;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("India");
        hs.add("USA");
        hs.add("Brazil");
        System.out.println(hs);
        System.out.println("Hash Table contains USA : " + hs.contains("USA"));
        System.out.println("Hash Table contains UK : " + hs.contains("UK"));
        hs.remove("USA");
        System.out.println(hs);
        System.out.println("Hash Table contains USA : " + hs.contains("USA"));
        }
    }
