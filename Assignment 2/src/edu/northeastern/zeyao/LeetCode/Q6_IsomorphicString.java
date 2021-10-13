package edu.northeastern.zeyao.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Q6_IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        return transfer(s).equals(transfer(t));
    }
    private String transfer(String s){
        Map<Character, Character> map = new HashMap<>();
        char count = 'a';
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])) sb.append(map.get(arr[i]));
            else{
                map.put(arr[i], count++);
                sb.append(count - 1);
            }
        }
        return sb.toString();
    }
}
