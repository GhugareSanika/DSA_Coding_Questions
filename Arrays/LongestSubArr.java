/*-----------------Longest subarray with sum divisible by K---------------- 
    Input:
    N = 6, K = 3
    arr[] = {2, 7, 6, 1, 4, 5}
    Output: 
    4
    Explanation:
    The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.
*/

import java.util.HashMap;
import java.util.Map;

public class LongestSubArr {
    public int longSubarrWthSumDivByK(int[] a, int n, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += a[i];
            int rem = ((prefixSum % k) + k) % k;
            
            if (rem == 0) maxLength = i + 1;
            
            if (hmap.containsKey(rem)) {
                maxLength = Math.max(maxLength, i - hmap.get(rem));
            } else {
                hmap.put(rem, i);
            }
        }
        return maxLength;
    }
}
