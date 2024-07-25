/*----------------------------Next Permutation------------------------ 
    Input: N = 6
    arr = {1, 2, 3, 6, 5, 4}
    Output: {1, 2, 4, 3, 5, 6}
    Explaination: The next permutation of the 
    given array is {1, 2, 4, 3, 5, 6}.
*/

import java.util.ArrayList;
import java.util.List;

public class Next_Permutation {
    static void swap(int i,int j,int arr[]){
        while(i<j){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        int ind = -1;
        for(int i=N-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        List<Integer> l = new ArrayList<>();
        if(ind==-1){
            swap(0,N-1,arr);
        }else{
            for(int i=N-1;i>=0;i--){
                if(arr[i]>arr[ind]){
                    int temp=arr[i];
                    arr[i]=arr[ind];
                    arr[ind]=temp;
                    break;
                }
            }
            swap(ind+1,N-1,arr);
        }
        for(int i=0;i<N;i++){
            l.add(arr[i]);
        }
        return l;
    }
}
