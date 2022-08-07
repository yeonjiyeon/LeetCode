class Solution {
    public int findCenter(int[][] edges) {
        int max = 0;
        int answer = 0;
        int[] check = new int[edges.length + 1];
        
        for(int i = 0; i < edges.length; i++){
            check[edges[i][0] - 1]++;
            check[edges[i][1] - 1]++;
        }
        
        
       for(int i = 0; i < check.length; i++){
           if(check[i] > max){
               max = check[i];
               answer = i + 1;
               //System.out.println(answer);
           }
       }
        
        return answer;
    
    }
}