class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i+=2){
            sum += Math.min(nums[i - 1], nums[i]); 
            
        }
        
        return sum;
    }
}