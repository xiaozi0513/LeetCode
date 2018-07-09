package com.wh.leetcode.pid002;

/**
 * 两数相加
 * @author: wang_hui
 * @date: 2018/7/9 下午2:12
 */
public class Solution002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode current = root;
        int flag = 0;//进位标志

        while (l1 != null || l2 != null || flag != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum = sum + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            current.next = new ListNode(sum);
            current = current.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        Solution002 s = new Solution002();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = s.addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.print(res.val + ",");
            res = res.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
    }
}