class Mat implements Comparable<Mat>{
    int idx;
    int sold;
    public Mat(int idx, int sold){
        this.idx = idx;
        this.sold = sold;
    }
    
    @Override
	public int compareTo(Mat pos) {
        return this.sold - pos.sold;
    }
}
    
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Mat[] arr = new Mat[mat.length];
        int[] res = new int[k];
        
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            arr[i] = new Mat(i, count);
            //System.out.println(count);
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < k; i++){
            res[i] =  arr[i].idx;
        }
        
        return res;
    }
}