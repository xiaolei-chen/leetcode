/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null; //从中间断开
        ListNode last = mid;
        ListNode pre = null;
        while (last != null) { //第二个链反转
            ListNode next = last.next;
            last.next = pre;
            pre = last;
            last = next;
        }
        while (head != null && pre != null) { //间隔插入
            ListNode next = head.next;
            head.next = pre;
            pre = pre.next;
            head.next.next = next;
            head = next;
        }
    }
}