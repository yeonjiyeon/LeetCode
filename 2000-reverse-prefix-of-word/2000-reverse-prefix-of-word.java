class Solution {
    public String reversePrefix(String word, char ch) {
        String result = "";
        int lt = 0, rt = 0;
        char[] charr = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(charr[i] == ch){
                rt = i;
                
                while(lt < rt){
                    char tmp = charr[lt];
                    System.out.println(charr[rt]);
                    charr[lt] = charr[rt];
                    charr[rt] = tmp;
                    lt++;
                    rt--;
                }
                break;
            }
        }
        
        for(char x : charr){
            result += x;
        }
        
        return result;
    }
}