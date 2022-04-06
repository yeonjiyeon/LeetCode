class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //int lt = 0, rt = image[i].length - 1;
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        
        
        
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length / 2; j++){
                int tmp = image[i][j];
                //System.out.print(tmp);
                image[i][j] = image[i][image[i].length -1 - j]; 
                image[i][image[i].length -1 - j] = tmp;
            }
        }
        
        return image;
    }
}