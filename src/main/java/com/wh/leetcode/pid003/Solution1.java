package com.wh.leetcode.pid003;

import java.util.HashMap;
import java.util.Map;

/**
 * #无重复字符的最长子串#<br>
 * 通过滑动窗口，使用哈希表存储字符，当遇到重复字符时，跳过中间一段继续往后滑动.区间[i,j)
 *
 * @author: wang_hui
 * @date: 2018/7/10 上午9:12
 */
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i) {
                i = map.get(s.charAt(j)) + 1;
            }
            size = Math.max(size, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return size;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        String str = "pwwkew";
        int res = s.lengthOfLongestSubstring(str);
        System.out.println(res);
    }
}
