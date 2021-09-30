package edu.northeastern.zeyao;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("==============Question 1==============");
        System.out.println("Example 1 : " + sumUnique(new int[]{1, 2, 3, 2}));
        System.out.println("Example 2 : " + sumUnique(new int[]{1, 1, 1, 1, 1}));
        System.out.println("Example 3 : " + sumUnique(new int[]{1, 2, 3, 4, 5}));
        System.out.println();

        System.out.println("==============Question 2==============");
        System.out.println("Example 1 : " + Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("Example 2 : " + Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
        System.out.println();

        System.out.println("==============Question 3==============");
        System.out.println("Example 1 : " + findNonRepeatedNum(new int[]{2, 3, 4, 2, 2, 3, 5, 7}));

        System.out.println("==============Question 4==============");
        System.out.println("Example 1 : " + canBeConstructed("a", "b"));
        System.out.println("Example 2 : " + canBeConstructed("aa", "ab"));
        System.out.println("Example 3 : " + canBeConstructed("aa", "aab"));

        System.out.println("==============Question 5==============");
        System.out.println("Example 1 : " + letterFollowedByDigit2("1A3d4s5t"));
        System.out.println("Example 2 : " + letterFollowedByDigit2("A2bb2d4"));
    }

    //Question 1
    public static int sumUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }

    //Question 2
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }

    //Question 3
    public static int findNonRepeatedNum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    //Question 4
    public static boolean canBeConstructed(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> magazineCounts = makeCountsMap(magazine);

        for (char c : ransomNote.toCharArray()) {
            int countInMagazine = magazineCounts.getOrDefault(c, 0);
            if (countInMagazine == 0) {
                return false;
            }
            magazineCounts.put(c, countInMagazine - 1);
        }
        return true;
    }

    public static Map<Character, Integer> makeCountsMap(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            int currCount = counts.getOrDefault(c, 0);
            counts.put(c, currCount + 1);
        }
        return counts;
    }

    //Question 5
    public static boolean letterFollowedByDigit2(String str) {
        int p1;
        int p2;
        if (Character.isDigit(str.charAt(0)) && Character.isLetter(str.charAt(1))) {
            for (p1 = 2; p1 < str.length(); p1 += 2) {
                if (Character.isDigit(str.charAt(p1)) == false) {
                    return false;
                }
            }
            for (p2 = 3; p2 < str.length(); p2 += 2) {
                if (Character.isLetter(str.charAt(p2)) == false) {
                    return false;
                }
            }
            return true;
        } else if (Character.isLetter(str.charAt(0)) && Character.isDigit(str.charAt(1))) {
            for (p1 = 2; p1 < str.length(); p1 += 2) {
                if (Character.isLetter(str.charAt(p1)) == false) {
                    return false;
                }
            }
            for (p2 = 3; p2 < str.length(); p2 += 2) {
                if (Character.isDigit(str.charAt(p2)) == false) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }
}



