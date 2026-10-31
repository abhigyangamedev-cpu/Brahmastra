package Maps.LeetCode.Easy;

import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        for(int ele : nums){
            if(freq.containsKey(ele)){
                freq.put(ele,freq.get(ele)+1);
            }else{
                freq.put(ele,1);
            }
        }

        for(int key : freq.keySet()){
            if(freq.get(key) > 1) return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(arr));
    }
}
