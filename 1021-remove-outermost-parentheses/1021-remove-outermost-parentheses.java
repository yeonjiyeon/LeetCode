class Solution {
    public String removeOuterParentheses(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        int left = 0, right = 0, start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                left++;
            } else if(s.charAt(i) == ')') {
                right++;
            }
            
            if(left == right) {
                for(int j = start + 1; j < i; j++){
                    stack.push(s.charAt(j));
                }
                
                start = i + 1;
            }
            
        }
        
        for(Character c : stack){
            answer += c;
        }
        return answer;
    }
}