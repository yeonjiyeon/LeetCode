/*
I:int[][]
O: int 
C:
E:
Solution
1. accounts의 루프를 돌며 변수에 해당 i의 j값들의 합을 더해주어서 비교한다 
Time: O(n^2)
Space
*/
class Solution {
    public int maximumWealth(int[][] accounts) { 
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                wealth += accounts[i][j];
                System.out.println(wealth);
            }
            max = Math.max(wealth, max);
        }
        return max;
    }
}