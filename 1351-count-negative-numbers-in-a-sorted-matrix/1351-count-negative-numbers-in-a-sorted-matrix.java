class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
//         int max = grid[0][0];
//         int min = 0;
        

        // while(max > min){
        //     int mid =  
        // }
        for(int i = grid.length - 1; i >= 0; i--){
            for(int j = grid[i].length -1; j >= 0; j--){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        
        return count;
    }
}