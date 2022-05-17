class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        
        for(int x : nums){
            if(original == x){
                original = x * 2;
            } 
        }
        
        return original;
    }
}