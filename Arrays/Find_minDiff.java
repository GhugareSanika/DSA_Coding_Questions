/*------------------Chocolate Distribution Problem--------------- 
    
    N = 8, M = 5
    A = {3, 4, 1, 9, 56, 7, 9, 12}
    Output: 6
    Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Find_minDiff {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<(n-m+1);i++){
            min=Math.min(min,a.get(i+m-1)-a.get(i));
        }
        return min;
    }
}
