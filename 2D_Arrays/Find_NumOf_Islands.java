/*---------------------------------Find the number of islands---------------------------- 
    Input: grid = [[0,1],[1,0],[1,1],[1,0]]
    Output: 1
    Explanation:
    The grid is-
    0 1
    1 0
    1 1
    1 0
    All lands are connected.
*/
public class Find_NumOf_Islands {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                if(grid[i][k]=='1'){
                    count++;
                    dfs(grid,i,k);
                }
            }
        }
        return count;
    }
    
    private void dfs(char [][] grid, int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        for(int n=-1;n<=1;n++){
            for(int m=-1;m<=1;m++){
                int delrow=i+n;
                int delcol=j+m;
                dfs(grid, delrow, delcol);
            }
        }
    }
}
