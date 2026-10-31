package Maps.LeetCode.Easy;


import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(!hm.containsKey(ch)) return false;
            hm.put(ch,hm.get(ch)-1);
            if(hm.get(ch) == 0) hm.remove(ch);
        }

        return hm.isEmpty();
    }

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        System.out.print(isAnagram(s,t));
    }
}
