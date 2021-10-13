package edu.northeastern.zeyao.LeetCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        System.out.println("================== Question 1 ==================");
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Example 1：" + Arrays.deepToString(Q1_TransposeMatrix.transpose(matrix1)));
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println("Example 2：" + Arrays.deepToString(Q1_TransposeMatrix.transpose(matrix2)));

        System.out.println("================== Question 2 ==================");
        String[] wordsDict = {"practice","makes","perfect","coding","makes"};
        System.out.println("Example 1 : " + Q2_WordDist.shortestDistance(wordsDict,"coding","practice"));
        System.out.println("Example 2 : " + Q2_WordDist.shortestDistance(wordsDict,"makes","coding"));

        System.out.println("================== Question 3 ==================");
        int[] nums1 = {0,1,0,3,12};
        System.out.println("Example 1: " + Arrays.toString(Q3_MoveZeroes.moveZeroes(nums1)));
        int[] nums2 = {0};
        System.out.println("Example 2: " + Arrays.toString(Q3_MoveZeroes.moveZeroes(nums2)));

        System.out.println("================== Question 4 ==================");
        int[][] Q4_matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Example 1: " + Arrays.deepToString(Q4_RotateImage.rotate(Q4_matrix1)));
        int[][] Q4_matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("Example 2: " + Arrays.deepToString(Q4_RotateImage.rotate(Q4_matrix2)));
        int[][] Q4_matrix3 = {{1}};
        System.out.println("Example 3: " + Arrays.deepToString(Q4_RotateImage.rotate(Q4_matrix3)));
        int[][] Q4_matrix4 = {{1,2},{3,4}};
        System.out.println("Example 4: " + Arrays.deepToString(Q4_RotateImage.rotate(Q4_matrix4)));

        System.out.println("================== Question 5 ==================");
        int[][] Q5_matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Example 1: " + Q5_SpiralMatrix.spiralOrder(Q5_matrix1));
        int[][] Q5_matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Example 2: " + Q5_SpiralMatrix.spiralOrder(Q5_matrix2));

        System.out.println("================== Question 6 ==================");
        System.out.println("Example 1: " + new Q6_IsomorphicString().isIsomorphic("egg","add"));
        System.out.println("Example 2: " + new Q6_IsomorphicString().isIsomorphic("foo","bar"));
        System.out.println("Example 3: " + new Q6_IsomorphicString().isIsomorphic("paper","title"));

        System.out.println("================== Question 7 ==================");
        System.out.println("Example 1: " + Q7_AddStrings.addStrings("11","123"));
        System.out.println("Example 2: " + Q7_AddStrings.addStrings("456","77"));
        System.out.println("Example 3: " + Q7_AddStrings.addStrings("0","0"));

        System.out.println("================== Question 8 ==================");
        System.out.println("Example 1: " + new Q8_ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Example 2: " + new Q8_ValidPalindrome().isPalindrome("race a car"));

        System.out.println("================== Question 9 ==================");
        System.out.println("Example 1: " + Q9_ReverseWordsInAString.reverseWords("the sky is blue"));
        System.out.println("Example 2: " + Q9_ReverseWordsInAString.reverseWords(" hello world "));
        System.out.println("Example 3: " + Q9_ReverseWordsInAString.reverseWords("a good  example"));
        System.out.println("Example 4: " + Q9_ReverseWordsInAString.reverseWords("  Bob   Loves   Alice   "));
        System.out.println("Example 5: " + Q9_ReverseWordsInAString.reverseWords("Alice does not even like bob"));

        System.out.println("================== Question 10 ==================");
        System.out.println("Example 1: " + new Q10_StringCompression().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println("Example 2: " + new Q10_StringCompression().compress(new char[]{'a'}));
        System.out.println("Example 3: " + new Q10_StringCompression().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
        System.out.println("Example 4: " + new Q10_StringCompression().compress(new char[]{'a','a','a','b','b','a','a'}));




    }
}
