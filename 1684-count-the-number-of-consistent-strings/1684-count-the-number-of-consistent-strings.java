class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(char x : allowed.toCharArray()){
            set.add(x);
        }
        
       
        
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(!set.contains(word.charAt(i))){
                    break;
                }

                if(i == word.length() -1){
                    count++;
                }
            }
	    }

        return count;
    }
}