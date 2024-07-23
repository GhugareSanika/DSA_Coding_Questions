/*-----------------------Longest Repeating Character Replacement------------------
    Input: s = "ABAB", k = 2
    Output: 4
    Explanation: Replace the two 'A's with two 'B's or vice versa.
*/

public class Repeating_Char_Replace {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0, j = 0, replace = 0;
            while (j < n) {
                if (s.charAt(j) == c) {
                    j++;
                } else if (replace < k) {
                    j++;
                    replace++;
                } else if (s.charAt(i) == c) {
                    i++;
                } else {
                    i++;
                    replace--;
                }
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
}
