package Maps.StandardQuestions;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {

        Map<Integer,Integer> freq = new HashMap<>();

        for(int ele : nums){
            if(freq.containsKey(ele))freq.put(ele,freq.get(ele)+1);
            else freq.put(ele,1);
        }

        int maxCount = 0;

        for(int ele : freq.keySet()){

            if(!freq.containsKey(ele-1)){
                int currNum = ele;
                int count = 1;

                while(freq.containsKey(currNum + 1)){
                    currNum++;
                    count++;
                }

                maxCount = Math.max(maxCount,count);
            }
        }

        return maxCount;
    }

    public static void main(String[] args){
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
