package edu.northeastern.zeyao;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
        public static int sumOfRepeatedNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else if(map.containsKey(nums[i])){
                sum += nums[i];
                map.put(nums[i], map.get(nums[i])+ 1);
            }
            if(map.get(nums[i]) > 2){
                sum -= nums[i];
            }
        }
        return sum;
    }
}
