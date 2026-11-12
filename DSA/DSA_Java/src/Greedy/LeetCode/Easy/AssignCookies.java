package Greedy.LeetCode.Easy;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        for (int cookie : s) {
            if (child < g.length && g[child] <= cookie) child++;
        }
        return child;
    }

    public static void main(String[] args){
        int[] g = {1,2,3};
        int[] s = {1,1};

        System.out.println(findContentChildren(g,s));
    }
}
