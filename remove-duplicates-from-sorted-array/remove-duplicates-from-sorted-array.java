class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        
        for(int n : nums){
            set.add(n);
        }
        
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            nums[i++] = (int)iter.next();
        }
        
        while(i < nums.length){
            nums[i++] = 100;
        }
        
        Arrays.sort(nums);
        
        return set.size();
    }
}