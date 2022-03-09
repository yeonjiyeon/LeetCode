/*
I:int
O:int
C
E
*/
class Solution {
    public int minimumSum(int num) {
        String s1 = "";
        String s2 = "";
        int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(digits);
        
       for(int i = 0; i < digits.length; i += 2){
           s1 += "" + digits[i];
           System.out.println(s1);
       }
        
        for(int i = 1; i < digits.length; i += 2){
           s2 += "" + digits[i];
       }
        
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        
        return num1 + num2;
    }
}