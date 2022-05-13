class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0){
            int tmp = n % 10;
            sum += tmp;
            product *= tmp;
            //System.out.println(sum);
            n = n / 10;
        }
        
        return product - sum;
    }
}