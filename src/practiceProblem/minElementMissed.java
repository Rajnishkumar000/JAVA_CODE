package practiceProblem;

import java.util.*;

public class minElementMissed
{
    public static void main(String[] args) {
        int arr[]={1,3,5,6,4};
//         Arrays.sort(arr);
//        for (int i=0;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }

//        GKG REFERENCE
//        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//
//        // Mapping string values to int keys
//        hash_map.put(10, "Geeks");
//        hash_map.put(15, "4");
//        hash_map.put(20, "Geeks");
//        hash_map.put(25, "Welcomes");
//        hash_map.put(30, "You");
//
//        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + hash_map);
//
//        // Checking for the key_element '20'
//        System.out.println("Is the key '20' present? " +
//                hash_map.containsKey(20));
//
//        // Checking for the key_element '5'
//        System.out.println("Is the key '5' present? " +
//                hash_map.containsKey(5));


        int c=0;
        int size=arr.length;
            HashMap<Integer, String> hs = new HashMap<>();
            for(int i = 0;i< size; i++) {
                hs.put(arr[i], "RAJNISH");

            }
        System.out.println(hs);
            for(int i=1;i< size+1; i++) {
                if (!hs.containsKey(i)){
                    c= i;
                }
            }
        System.out.println(c);

        }

    }

