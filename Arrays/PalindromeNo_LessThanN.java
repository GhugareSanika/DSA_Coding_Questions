/*-------------------Generate all palindromic numbers less than n-----------------------
    Input:
    N = 12
    Output:
    10
    Explanation:
    There are 10 palindrome number less than 12.
    1 2 3 4 5 6 7 8 9 11
 */

public class PalindromeNo_LessThanN {
    static boolean tocheck(int n){
        if(n>=1 && n<=9){
            return true;
        }
        int temp=n;
        int res=0;
        while(temp>0){
            int digit=temp%10;
            res=res*10+digit;
            temp=temp/10;
        }
        if(n==res){
            return true;
        }
        return false;
    }
    static int palindromicNumbers(int N){
        int count=0;
        for(int i=1;i<N;i++){
            boolean ans= tocheck(i);
            if(ans==true){
                count++;
            }
        }
        return count;
    }
}
