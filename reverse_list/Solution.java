package reverse_list;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public ListNode recursiveReverseList(ListNode head) {
        return buildReverse(null, head);
    }

    private ListNode buildReverse(ListNode newHead, ListNode head){
        if(head == null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        newHead = head;
        return buildReverse(newHead, next);
    }
}
