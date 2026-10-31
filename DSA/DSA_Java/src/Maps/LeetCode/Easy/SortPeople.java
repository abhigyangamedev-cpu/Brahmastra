package Maps.LeetCode.Easy;

import java.util.*;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> hm = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            hm.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] ans = new String[names.length];

        for (int i = 0; i < heights.length; i++) {
            ans[i] = hm.get(heights[heights.length - 1 - i]);
        }

        return ans;
    }

    public static void main(String[] args){
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};

        String[] ans = sortPeople(names,heights);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
