package Question3;

import java.util.HashMap;
import java.util.Map;

public class SubarrayEqualsK {
    public static int sumToK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            Integer value = map.get(sum);
            if (value != null) {
                map.put(sum, value + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(sumToK(nums,2));

        int[] nums2 = {1,2,3};
        System.out.println(sumToK(nums2,3));
    }
}
