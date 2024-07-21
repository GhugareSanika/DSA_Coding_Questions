/*-----------------------Array Duplicates----------------------
    Input: arr[] = {2,3,1,2,3}, n = 5
    Output: 2 3 
    Explanation: 2 and 3 occur more than once in the given array.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Arr_Duplicates {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                i++;
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }else{
            Collections.sort(list);
        }
        return list;
    }
}
