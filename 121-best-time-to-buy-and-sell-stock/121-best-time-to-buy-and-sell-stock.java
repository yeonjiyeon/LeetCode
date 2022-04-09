class Solution {
    public int maxProfit(int[] prices) {
        int min = 10000;
        int max = 0;
        int answer = 0;
        int lt = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
              min = prices[i]; 
            }
            
            answer = Math.max(answer, prices[i] - min);
        }
        
        
        return answer;
    }
}