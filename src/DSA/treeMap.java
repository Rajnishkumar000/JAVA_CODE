package DSA;
import java.util.TreeMap;
public class treeMap
{
        public static void main(String[] args) {
// create a tree map.
            TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
// Put elements into the map
            tm.put("Mason", 55);
            tm.put("Jacob", 77);
            tm.put("William", 99);
            tm.put("Emma", new Integer(65));
            System.out.println("Students count :: " + tm.size());

            for(String key : tm.keySet())
            {
                System.out.println(key + " score marks :" + tm.get(key));
            }
            System.out.println("Emma score present::" + tm.containsKey("Emma"));
            System.out.println("John score present:: " + tm.containsKey("John"));
            tm.remove("Emma");
            System.out.println("Emma score present::" + tm.containsKey("Emma"));
        }
    }

