package Maps.StandardQuestions;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(!hm.containsKey(key)) hm.put(key, new ArrayList());

            hm.get(key).add(word);
        }

        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args){

    }
}
