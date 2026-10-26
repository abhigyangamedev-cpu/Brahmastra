package Maps.StandardQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 2 && (nums[0] + nums[1] == target)) return new int[] {0,1};
        Map<Integer,Integer> hm = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])) return new int[]{hm.get(nums[i]),i};
            hm.put(target -nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args){

    }
}
