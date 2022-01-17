/*
I:int[], int
O: List<Boolean>
C
E
Solution
1. 1바퀴 루프를 돌며 extraCandies를 더했을 때 큰 값이 존재 안하면 list res에 참값을 추가, 존재하면 false를 추가한다
Time:O(n*2)
Space:
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        boolean greatest = true;
        for(int i = 0; i < candies.length; i++){
            for(int j = 0; j < candies.length; j++){
                if(candies[i]+extraCandies >= candies[j]){
                    greatest = true;
                }else{
                    greatest = false;
                    break;
                }
            }
            if(greatest){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}