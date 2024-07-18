/*---------------------Product of Array except self----------------------

    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
 */

package Arrays;

public class Product_ExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        if (n < 1) {
            return output;
        }
        
        //Prefix Product from start
        int product = 1;
        for (int i = 0; i < n; ++i) {
            product *= nums[i];
            output[i] = product;
        }
        
        //Prefix Product from end
        product = 1;
        for (int i = n - 1; i > 0; --i) {
            output[i] = output[i - 1] * product;
            product *= nums[i];
        }
        
        output[0] = product;
        return output;
    }
}
