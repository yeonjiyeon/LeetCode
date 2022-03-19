class Solution {
    public int minPartitions(String n) {
        int answer = 0; 
        int[] digits = Stream.of(n.split("")).mapToInt(Integer::parseInt).toArray();
        for(int x : digits){
            if(x > answer)
            answer = x;
        }
        return answer;
    }
}