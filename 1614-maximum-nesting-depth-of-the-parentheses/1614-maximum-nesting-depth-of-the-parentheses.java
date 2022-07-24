class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0, answer = 0;
        for(char x : s.toCharArray()){
            if(x == '(') stack.push(x);
            else if(x == ')') stack.pop();
            
            max = Math.max(max, stack.size());
        }
        
        return max;
    }
}