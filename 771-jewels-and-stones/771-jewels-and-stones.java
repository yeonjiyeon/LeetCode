/*
I:String, String
O:int
C:
E: jewels.length() > stones.length() x
Solution 
1.
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        char[] word = stones.toCharArray();
        char[] keyword = jewels.toCharArray();
        int count = 0;
        for(int i = 0; i < keyword.length; i++){
            for(int j = 0; j < word.length; j++){
             if(keyword[i] == word[j]){
                 count++;
             }   
            }
        }
        return count;
    }
}