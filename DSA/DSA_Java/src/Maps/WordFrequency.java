package Maps;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args){
        String[] fruits = {"apple","banana","guava",
                "mango","apple","apple","banana"};
        Map<String,Integer> freq = new HashMap<>();

        for(String fruit : fruits){
            if(freq.containsKey(fruit)){
                freq.put(fruit,freq.get(fruit)+1);
            }else{
                freq.put(fruit,1);
            }
        }

        System.out.print(freq);
    }
}
