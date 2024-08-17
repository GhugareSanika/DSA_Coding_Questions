/*--------------------------------Spiral Matrix-------------------------------
 
    Given an m x n matrix, return all elements of the matrix in spiral order.
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [1,2,3,6,9,8,7,4,5]
 
*/
import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();

        int rows=matrix.length, cols=matrix[0].length;
        int left=0,right=cols-1,top=0,bottom=rows-1;
        if(matrix==null || matrix.length==0){
            return ans;
        }

        while(left<=right && top<=bottom){
            //traverse from left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //traverse from top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //traverse from right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //traverse from bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
