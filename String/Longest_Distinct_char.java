/*------------------------Longest Distinct characters in string-----------------------
    Input:
    S = "geeksforgeeks"
    Output: 7
    Explanation: "eksforg" is the longest 
    substring with all distinct characters. 
*/
import java.util.HashMap;

public class Longest_Distinct_char {
    static int longestSubstrDistinctChars(String S){
        HashMap<Character , Integer> map = new HashMap<Character, Integer>();
        
        int l=0;
        int r=0;
        int n=S.length();
        int len=0;
        
        while(r<n){
            if(map.containsKey(S.charAt(r))){
                l= Math.max(map.get(S.charAt(r))+1,l);
            }
            map.put(S.charAt(r),r);
            len=Math.max(r-l+1,len);
            r++;
        }
        
        return len;
    }
}
