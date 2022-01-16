/*
I:
O:
C:
E:
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        for(int i = 0,idx = 0; idx < nums.length; i++){
            
            res[idx++] = nums[i];
            res[idx++] = nums[n];
            n++;
             
        }
        return res;
    }
}