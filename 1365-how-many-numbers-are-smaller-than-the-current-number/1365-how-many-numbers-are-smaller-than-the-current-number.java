/*
I:int[]
O:int[]
C:
E:
Solution
1. nums를 돌면서 첫번째부터 차례대로 해당 값과 나머지 값들을 비교한다. 
Time:O(n^2)
Space:
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                res[i] = count;
            }
        }
        return res;
    }
}