/*
I:int[], int
O: int
C:
E:
Solution
1.nums 이중루프돌면서 차가 k인값을 찾아준다
time: O(n^2)
*/
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
           for(int i = 0; i < nums.length; i++){
               for(int j = i; j < nums.length; j++){
                   if(Math.abs(nums[i] - nums[j])== k) count++;
               }
           }
        return count;
    }
}