/*---------------------------Maximum Product Subarray----------------------
    Input: nums = [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.
*/

package Arrays;

public class Max_Product_SubArray {
    public int maxProduct(int[] nums) {
        double leftProduct = 1;
        double rightProduct = 1;
        double ans = nums[0];
        for(int i=0;i<nums.length;i++){
         if(leftProduct==0){
             leftProduct=1;
         }
         if(rightProduct==0){
             rightProduct=1;
         }
         leftProduct = leftProduct*nums[i];
         rightProduct = rightProduct * nums[nums.length-i-1];
         ans = Math.max(ans,Math.max(leftProduct,rightProduct));
        } 
        return (int)ans;
     }
}
