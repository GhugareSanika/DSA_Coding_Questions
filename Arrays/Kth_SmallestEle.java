/*-------------Find Kth Smallest Element---------------
    Input:
    n = 6
    arr[] = 7 10 4 3 20 15
    k = 3
    l=0 r=5

    Output : 
    7
*/
package Arrays;
import java.util.Arrays;

public class Kth_SmallestEle {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k-1];
    } 
}
