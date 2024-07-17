/*---------------------Contains Duplicate----------------

    Input: nums = [1,2,3,1]
    Output: true
*/

import java.util.HashSet;

public class Contains_Dupli {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
