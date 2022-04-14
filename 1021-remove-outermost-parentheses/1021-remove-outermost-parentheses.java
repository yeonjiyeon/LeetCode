class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        int left = 0, right = 0, start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                left++;
            } else if(s.charAt(i) == ')') {
                right++;
            }
            
            if(left == right) {
                sb.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }
}