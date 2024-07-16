
/*-------------------------Min and Max in Array---------------------------- 
 
    Input: arr = [3, 2, 1, 56, 10000, 167]
    Output: 1 10000
*/

package Arrays;
import java.util.Arrays;

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        long min=arr[0];
        long max=arr[arr.length-1];
        
        return new Pair(min,max);
    }
}