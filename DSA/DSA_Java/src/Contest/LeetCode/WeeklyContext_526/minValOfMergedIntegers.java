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
}
