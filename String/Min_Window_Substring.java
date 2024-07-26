/*---------------------------Minimum Window Substring--------------------------- 
    Input: s = "ADOBECODEBANC", t = "ABC"
    Output: "BANC"
    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
*/
public class Min_Window_Substring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        
        int[] map = new int[128];//store the frequency of characters in 't'
        int count = t.length();
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        
        for (char c : t.toCharArray()) map[c]++;//populates our map array with the frequency of each character in string t
        
        while (end < s.length()) {
            if (map[s.charAt(end++)]-- > 0) count--;
            
            while (count == 0) {
                if (end - start < minLen) {
                    minStart = start;
                    minLen = end - start;
                }
                
                if (map[s.charAt(start++)]++ == 0) count++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
