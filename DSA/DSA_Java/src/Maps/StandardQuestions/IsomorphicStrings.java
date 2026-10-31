package Maps.StandardQuestions;

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> shm = new HashMap<>();
        Map<Character,Integer> thm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            if(!shm.containsKey(s.charAt(i))) shm.put(s.charAt(i),i);
            if(!thm.containsKey(t.charAt(i))) thm.put(t.charAt(i),i);

            if(!shm.get(s.charAt(i)).equals(thm.get(t.charAt(i)))) return false;
        }

        return true;
    }

    public static void main(String[] args){
        String s = "egg";
        String t = "add";
        
        System.out.println(isIsomorphic(s,t));
    }
}
