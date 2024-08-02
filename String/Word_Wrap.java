/*----------------------------Word Wrap----------------------------
    Input: nums = {3,2,2,5}, k = 6
    Output: 10
*/

import java.util.Arrays;

class Word_Wrap{
    public int solveWordWrap (int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[n] = 0; // base case
        for(int i=n-1; i>=0; i--) {
            int sum = 0; //sum keep tracks to current line width including the current word
            for(int j=i; j<n && sum + nums[j]<=k; j++) {
                sum += nums[j];
                int spaces = (j != n-1) ? k-sum : 0; ///spaces represents the number of extra spaces left at the end of the current line(no extra spaces needed for the last word)
                dp[i] = Math.min(dp[i], spaces*spaces+dp[j+1]);
                sum++;
            }
        } 
        return dp[0];
    }
}

