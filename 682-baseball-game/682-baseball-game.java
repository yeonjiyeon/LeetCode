class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("+")){
                int rt = (int)stack.pop();
                //System.out.println(rt);
                int lt = (int)stack.pop();
                stack.push(lt);
                stack.push(rt);
                stack.push(lt + rt);
            }else if(ops[i].equals("C")){
                stack.pop();
            }else if(ops[i].equals("D")){
                int tmp = (int)stack.pop();
                stack.push(tmp);
                stack.push(tmp * 2);
            }else{
                stack.push(Integer.parseInt(ops[i]));    
            }  
            
        }
        
        for(int x : stack){
            //System.out.println(x);
            sum += x;
        }
        
        return sum;
    }
}