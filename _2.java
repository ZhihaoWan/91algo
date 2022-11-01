class Solution{
    public ListNode addTwoBymbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);

        ListNode curr = dummy;

        int carry = 0;
        int sum = 0;

        while(l1 != null || l2 != null){
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;

            sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;
            curr.next = new ListNode(sum);

            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) curr.next = new ListNode(carry);

        return dummy.next;
    }
}