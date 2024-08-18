/*----------------------Rotate Image------------------------ 
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
*/

public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int edgelength=matrix.length;

        int top=0;
        int bottom=edgelength-1;

        while(top<bottom){
            for(int col=0;col<edgelength;col++){
                int temp=matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col]=temp;
            }
            top++;
            bottom--;
        }
        for(int row=0;row<edgelength;row++){
            for(int col=row+1;col<edgelength;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
    }
}
