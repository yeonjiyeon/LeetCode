class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] cnt = new int[n + 1];
        for(int[] x : trust){
            cnt[x[0]]--;
            cnt[x[1]]++;
        }
        
        for(int i = 1; i <= n; i++){
            if(cnt[i] == n - 1) return i; 
        }
        return -1;
    }
}