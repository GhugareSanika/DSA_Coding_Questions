/*-------------------------Kth Largest Element in an Array----------------

    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5
 */

package Arrays;

import java.util.PriorityQueue;

public class Kth_LargestEle {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
