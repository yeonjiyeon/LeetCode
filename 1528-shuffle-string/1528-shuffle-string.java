/*
I: String, int[]
O: String
C
E
Solution
1.
Time: 
Space
*/
class Solution {
    public String restoreString(String s, int[] indices) {
   char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) arr[indices[i]] = s.charAt(i);
        return String.valueOf(arr);
    }  
}