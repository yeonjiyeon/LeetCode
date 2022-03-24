/*

*/
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int num = 0;
        int answer = 0;
        for(int i = 0; i < seats.length; i++){
            num = students[i] - seats[i];
            answer += Math.abs(num);
        }
        return answer;
    }
}