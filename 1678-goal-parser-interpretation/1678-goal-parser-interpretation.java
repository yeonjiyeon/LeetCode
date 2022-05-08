class Solution {
    public String interpret(String command) {
        String res = command.replace("()", "o").replace("(al)", "al");
        
        return res;
    }
}