/*--------------------------- 3Sum-----------------------
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation: 
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
 */

package Arrays;

public class 3Sum {
    public List<List<Integer>> threeSum(int[] arr) {
        if(arr==null || arr.length<3)
            return new ArrayList<>();

        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        //Fix the 1st element and find the other two elements
        for(int i=0;i<arr.length-2;i++){
            //find other two elements using two sum approach
            int left=i+1;
            int right=arr.length-1;

            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    //Add set and Find the other triplets
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
