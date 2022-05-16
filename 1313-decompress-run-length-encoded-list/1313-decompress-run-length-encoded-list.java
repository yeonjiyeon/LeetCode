class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < nums.length; i+=2){
            for(int j = 0; j < nums[i - 1]; j++){
                list.add(nums[i]);
            }
        }
        
        int[] res = new int[list.size()];
        
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        
        return res;
    }
}