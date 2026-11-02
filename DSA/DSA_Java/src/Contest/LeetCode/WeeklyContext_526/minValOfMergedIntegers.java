package Contest.LeetCode.WeeklyContext_526;

public class minValOfMergedIntegers {
    public static int minMergedInteger(int[] nums) {

        int MinVal = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i += 2){
            int pair = Integer.parseInt("" + nums[i] + nums[i+1]);
            MinVal = Math.min(MinVal,pair);
        }

        return MinVal;

    }

    public static void main(String[] args){

        int[] arr = {23,55,42,21};
        System.out.println(minMergedInteger(arr));
    }
}
