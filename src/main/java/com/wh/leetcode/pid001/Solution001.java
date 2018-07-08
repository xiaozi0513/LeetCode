package com.wh.leetcode.pid001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author wang_hui
 * @date 2018/7/8 21:39
 **/
public class Solution001 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution001 s = new Solution001();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        if (res != null) {
            System.out.println(Arrays.toString(res));
        } else {
            System.out.println("not find.");
        }
    }
}
