/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode pre = head;
        ListNode cur = head;
        for (int i=0; i<n; ++i){
            cur = cur.next;
        }
        //如果此时cur指向空，说明N为链表的长度，则需要移除的为首元素，那么此时我们返回head.next即可
        if (cur == null) return head.next;
        //如果cur存在，我们再继续往下走，此时pre指针也跟着走，直到cur为最后一个元素时停止
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        //此时pre指向要移除元素的前一个元素，我们再修改指针跳过需要移除的元素即可
        pre.next = pre.next.next;
        return head;
    }
}