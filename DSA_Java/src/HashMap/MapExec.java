package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExec {

    public static void printMapEntry(Map<String,Integer> hm ){
        for(Map.Entry<String,Integer> ele : hm.entrySet()){
            System.out.println("Key : " + ele.getKey() + " -> Value: " + ele.getValue());
        }
    }

    public static void printMapKey(Map<String,Integer> tm){
        for(String key : tm.keySet()){
            System.out.println("Key : " + key + " -> Value : " + tm.get(key));
        }
    }

    public static void main(String[] args){

        Map<String,Integer> hm = new HashMap<>();
        Map<String,Integer> tm = new TreeMap<>();

        hm.put("Hello",1);
        hm.put("Hi",2);
        hm.put("Bye",3);

        tm.put("Hello",1);
        tm.put("Hi",2);
        tm.put("Bye",3);

        System.out.println("Printing the Hashmap :- ");
        printMapEntry(hm);

        System.out.println("Prinitng the TreeMap :- ");
        printMapKey(tm);

    }
}
