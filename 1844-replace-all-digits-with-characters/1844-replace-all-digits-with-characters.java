class Solution {
    public String replaceDigits(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                answer += s.charAt(i);
                //System.out.println(i + 1);
                if(i + 1 < s.length()){
                    if(Character.isDigit(s.charAt(i + 1))){
                    answer += (char)((int)s.charAt(i) + (s.charAt(i + 1) - '0'));
                 }    
                }
                
            }
            
        }
        
        return answer;
    }
}