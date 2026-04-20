class Solution {
    public void rotate(int[][] matrix) {
        

        for(int i = 0; i < matrix.length/2; i++){
            arraySwap(matrix, i, matrix.length - i - 1);
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        
    }

    private void arraySwap(int[][] matrix, int i, int j){
        int[] temp = new int [matrix.length];

        for(int k = 0; k <matrix.length; k++){
            temp[k] = matrix[i][k];
        }

        for(int k = 0; k <matrix.length; k++){
            matrix[i][k] = matrix[j][k];
        }

        for(int k = 0; k <matrix.length; k++){
            matrix[j][k] = temp[k];
        }
    }


}