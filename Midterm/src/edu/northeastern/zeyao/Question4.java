package edu.northeastern.zeyao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question4 {
    public static List<Character> findLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> res = new ArrayList<>();
        if (s.length() == 0) return null;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
                res.add(s.charAt(i));
            } else if (map.containsKey(s.charAt(i))) {
                break;
            }
        }
        return res;
    }
}
