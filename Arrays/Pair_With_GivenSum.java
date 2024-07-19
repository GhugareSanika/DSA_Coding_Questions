/*---------------------------Pair with given sum in a sorted array----------------
    Input:
    n = 7
    arr[] = {1, 2, 3, 4, 5, 6, 7}
    K = 8
    Output:
    3
    Explanation:
    We find 3 such pairs that
    sum to 8 (1,7) (2,6) (3,5)
*/

package Arrays;

public class Pair_With_GivenSum {
    int Countpair(int a[], int n, int sum)
    {
        // Complete the function
        int low=0;
        int high=n-1;
        int count=0;
        while(low<high){
            if(a[low]+a[high]==sum){
                count++;
                high--;
            }else if(a[low]+a[high]<sum){
                low++;
            }else{
                high--;
            }
        }
        return count>0?count:-1;
    }
}
