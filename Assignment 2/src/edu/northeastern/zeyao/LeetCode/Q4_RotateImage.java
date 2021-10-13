package edu.northeastern.zeyao.LeetCode;

public class Q4_RotateImage {
    public static int[][] rotate(int[][] matrix) {
        if(matrix == null || matrix[0].length == 0){
            return null;
        }
        int len = matrix[0].length;
        int depth = len / 2;
        for(int i = 0; i <= depth; i++){
            int l = len - 2 * i - 1;
            for(int j = 0; j < l; j++){
                int temp = matrix[i + j][i];
                matrix[i + j][i] = matrix[len - 1 - i][j + i];
                matrix[len - 1 - i][j + i] = matrix[len - 1 - i - j][len - i - 1];
                matrix[len - 1 - i - j][len - i - 1] = matrix[i][len - 1 - i - j];
                matrix[i][len - 1 - i - j] = temp;
            }
        }
        return matrix;
    }
}
