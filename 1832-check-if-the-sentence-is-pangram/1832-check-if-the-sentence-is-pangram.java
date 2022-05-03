class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 97; i <= 122; i++){
            set.add((char)i);
            //System.out.println((char)i);
        }
        
        for(int i = 0; i < sentence.length(); i++){
            if(set.contains(sentence.charAt(i))) set.remove(sentence.charAt(i));
        }
        
        if(!set.isEmpty()) return false;
        
        return true;
    }
}