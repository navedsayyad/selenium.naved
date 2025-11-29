package test;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> capitalcities = new HashMap<>();

        capitalcities.put("India", "Delhi");
        capitalcities.put("America", "New York");
        capitalcities.put("England", "London");
        capitalcities.put("India1", "Delhi");



        //System.out.println(capitalcities.get("Indias"));
        //System.out.println(capitalcities.entrySet()); // Returns all values

        //System.out.println(capitalcities.containsValue("London")); // Returns true

        //System.out.println(capitalcities.getOrDefault("Wash","Del"));
        //System.out.println(capitalcities.get("England"));
        //System.out.println(capitalcities.containsValue("Delhi"));

        //System.out.println(capitalcities);
        //System.out.println(capitalcities.get("India"));

        /*capitalcities.remove("America");
        System.out.println(capitalcities);*/

        /*capitalcities.put("America", "Richmond");
        System.out.println(capitalcities);*/

        //System.out.println(capitalcities.size());

        //print key
        /*for (String i : capitalcities.keySet()){
            System.out.println(i);
        }

        //print values
        for (String i : capitalcities.values()){
            System.out.println(i);
        }*/

        // print key and values
        for (String i : capitalcities.keySet()){
            System.out.println("Key : " + i + " Values : " + capitalcities.get(i));
        }
    }
}
