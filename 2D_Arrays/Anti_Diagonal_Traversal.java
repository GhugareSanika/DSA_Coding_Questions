/*-------------------------Anti Diagonal Traversal of Matrix------------------------------
 
    Give a N*N square matrix, return an array of its anti-diagonals in top-leftmost to bottom-rightmost order. In an element of a anti-diagonal (i, j), surrounding elements will be (i+1, j-1) and (i-1, j+1). Look at the examples for more clarity.

    Example 1:

    Input:
    N = 2
    matrix[][] = 1 2
                 3 4
    Output:
    1 2 3 4
    Explanation:
    List of anti-diagnoals in order is
    {1}, {2, 3}, {4}

*/
public class Anti_Diagonal_Traversal {
    public int[] antiDiagonalPattern(int[][] matrix)
    {
       int n = matrix.length;
       int [] ans = new int[n*n];
       int index=0;
       
       //for upper matrix
       for(int i=0;i<n;i++){
           int row=0;
           int col=i;
           while(row<n&&col>=0){
               ans[index++]=matrix[row++][col--];
           }
       }
       
       //for upper matrix
       for(int i=1;i<n;i++){
           int row=i, col=n-1;
           while(row<n&&col>=0){
               ans[index++] = matrix[row++][col--];;
           }
       }
       return ans;
    }
}
