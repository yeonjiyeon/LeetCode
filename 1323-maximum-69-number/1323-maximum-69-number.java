class Solution {
    public int maximum69Number (int num) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i =0; i < digits.length; i++){
            System.out.println(digits[i]);
            if(digits[i] == 6){
                digits[i] = 9;
                System.out.println(digits[i]);
                 break;
            }
           
        }
        
     for(int digit: digits) { 
         answer *= 10; 
         answer += digit; 
     }
       
        
        return answer;
    }
}