class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        key = key.replaceAll(" ", "");
        char c = 'a';
        for(char x : key.toCharArray()){
            if(!map.containsKey(x)) map.put(x, c++);
            //System.out.println(c);
        }
        
        StringBuilder answer = new StringBuilder();
        for(char x : message.toCharArray()){
            if(map.containsKey(x)) answer.append(map.get(x));
            else answer.append(x);
        }
        
        return answer.toString();
    }
}