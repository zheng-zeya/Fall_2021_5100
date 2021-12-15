package Question2;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] strs ={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

        String[] strs1 = {""};
        System.out.println(groupAnagrams(strs1));

        String[] strs2 = {"a"};
        System.out.println(groupAnagrams(strs2));
    }
}

