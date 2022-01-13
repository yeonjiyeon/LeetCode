/*
I: int[] 
O: int[] 
C
E
Solution
1.nums를 순회하면서 배열의 각 요소를 더해 준다.

Time:
Space: 
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i-1] + nums[i];
        }
        
        return res;
    }
}