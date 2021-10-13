package edu.northeastern.zeyao.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q9_ReverseWordsInAString {
    public static String reverseWords(String s){
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
