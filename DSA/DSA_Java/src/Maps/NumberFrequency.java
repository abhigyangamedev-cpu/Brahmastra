package Maps;

import java.util.*;

public class NumberFrequency {
    public static void main(String[] args){
        int[] numbers = {100,4,200,1,3,2};
        Map<Integer,Integer> freq = new HashMap<>();

        for(int ele : numbers){
            if(freq.containsKey(ele)){
                freq.put(ele,freq.get(ele)+1);
            }else{
                freq.put(ele,1);
            }
        }

        System.out.print(freq);
    }

}
