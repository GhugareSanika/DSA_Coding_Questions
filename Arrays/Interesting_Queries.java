/*------------------------Interesting Queries---------------- 
    Input: nums = {1,1,2,1,3}, Queries = {{1,5},
    {2,4}}, k = 1
    Output: {3,2}
    Explanation: For the 1st query, from l=1 to r=5
    1, 2 and 3 have the frequency atleast 1.
    For the second query, from l=2 to r=4, 1 and 2 have 
    the frequency atleast 1.
*/
import java.util.ArrayList;

public class Interesting_Queries {
    class Solution {
    public int[] solveQueries(int[] nums, int[][] Queries, int k) {
        int n = nums.length;
        int maxVal = 0;
        
        // Find the maximum value in the nums array
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        // Create prefix frequency array with size based on the maximum value in nums
        int[][] freq = new int[n + 1][maxVal + 1];

        // Preprocessing to create the prefix frequency array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= maxVal; j++) {
                freq[i][j] = freq[i - 1][j];
            }
            freq[i][nums[i - 1]]++;
        }

        ArrayList<Integer> counts = new ArrayList<>();
        
        for (int i = 0; i < Queries.length; i++) {
            int l = Queries[i][0] - 1;  // 0-based index
            int r = Queries[i][1]; 
            int count = 0;
            
            for (int j = 0; j <= maxVal; j++) {
                int frequency = freq[r][j] - freq[l][j];
                if (frequency >= k) {
                    count++;
                }
            }
            
            counts.add(count);
        }
        
        int[] arr = new int[counts.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counts.get(i);
        }

        return arr;
    }
}
}
