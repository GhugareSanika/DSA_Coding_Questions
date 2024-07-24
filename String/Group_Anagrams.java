/*-------------------Group Anagrams-----------------

    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word:strs){
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                //If sorted word is not present,new entry is created with the sorted word as the key and an empty ArrayList as the value.
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);//original word is added to list of anagrams corresponding to sorted word in map.
        }
        return new ArrayList<>(map.values());
    }
}
