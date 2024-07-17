/*-------------------Maximum Subarray------------------- 
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/
class Max_SubArray {
    public int maxSubArray(int[] nums) {
        int MaxSum=Integer.MIN_VALUE;
        int CurrSum=0;
        for(int i=0;i<nums.length;i++){
            CurrSum=CurrSum+nums[i];
            MaxSum=Math.max(MaxSum,CurrSum);
            if(CurrSum<=0){
                CurrSum=0;
            }
        }
        return MaxSum;
    }
}