package HACKERRANKandLEETCODE;


import java.util.*;

public class jsonComparison {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String json1 = "{\"Hacker\":\"Rank\", \"Raj\":\"Nish\"}";
        String json2 = "{\"Hacker\":\"chef\", \"Kum\":\"Ar\"}";

        ArrayList<String> result = compareJson(json1, json2);

        System.out.println("Keys with different values: " + result);
    }

    public static ArrayList<String> compareJson(String json1, String json2) {
        Map<String, String> map1 = JsonToHashMap(json1);
        Map<String, String> map2 = JsonToHashMap(json2);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.keySet());
        System.out.println(map2.values());
       ArrayList<String> differingKeys = new ArrayList<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                String value1 = map1.get(key);
                String value2 = map2.get(key);

                // Compare values; if different, add to the result map
                if (!value1.equals(value2)) {
                    differingKeys.add(key);
                }
            }
        }

        return differingKeys;
    }

    public static Map<String, String> JsonToHashMap(String json) {
        Map<String, String> map = new HashMap<>();
        // Remove curly braces and quotes, and split by comma
        json = json.replaceAll("[{}\"]","");

        json=json.trim();//Removing whitespace
        System.out.println(json);

        String[] pairs = json.split(",");//Splitting using comma into array of strings
        System.out.println(Arrays.toString(pairs));

        // Split key-value pairs by colon and put them into the map
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            System.out.println(Arrays.toString(keyValue));
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                map.put(key, value);
            }
        }

        return map;
    }
}

