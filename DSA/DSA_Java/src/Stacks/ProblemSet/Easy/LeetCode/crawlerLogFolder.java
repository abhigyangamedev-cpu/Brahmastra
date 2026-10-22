package Stacks.ProblemSet.Easy.LeetCode;

import java.util.Stack;

public class crawlerLogFolder {
    public static int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for (String ele : logs) {
            if (ele.equals("../")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!ele.equals("./")) {
                st.push(ele);
            }
        }

        return st.size();
    }

    public static void main(String[] args){
        String[] arr = {"d1/","d2/","../","d21/","./"};

        System.out.println(minOperations(arr));
    }
}
