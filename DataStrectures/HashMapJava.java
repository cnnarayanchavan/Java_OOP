package DataStrectures;
import java.util.*;
public class HashMapJava {
    public static void main(String[] args){
       HashMap<String,Integer> myMap =  new HashMap<>();

       //put() method in HashMap
        myMap.put("Narayana", 2002);
        myMap.put("Nitin", 1996);
        myMap.put("Renuka", 1998);

        //get() method in HashMap
        System.out.println(myMap.get("Nitin"));
        System.out.println(myMap.get("Narayana"));

        //contains() method in HashMap
        System.err.println(myMap.containsKey("Narayana"));
        System.err.println(myMap.containsValue(1996));

        //putIfabsent() method in HashMap
        myMap.putIfAbsent("Ponit", 2024);

        
        //remove() method in HashMap
        myMap.remove("Ponit");

        System.out.println(myMap.size());

        System.out.println(myMap);
    }
}
